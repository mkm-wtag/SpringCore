package com.javabrains.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {
    @Before("allCircleMethods()")
    public  void LoggingAdvice(JoinPoint joinPoint){
//        System.out.println(joinPoint.toString());

    }
    @AfterThrowing("args(name)")
    public void stringArgumentMethods(String name){
        System.out.println("A Method that takes "+name);
    }

    @Pointcut("execution(* get*(..))")
   public void allgetters(){}

    @Pointcut("within(com.javabrains.AOP.model.*)")
    public void allCircleMethods(){}
}
