package com.aop.advices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SysoutAdvice {
	
  @Around("@annotation(com.annotations.Sysout) && execution(* *(..))")
  public Object print(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("Start....");
    try {
      return proceedingJoinPoint.proceed();
    }
    finally {
      System.out.println("End....");
    }
  }
}
