package com.javabrains.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Objects;

@Aspect
public class LoggingAspect {
//    @Before("allCircleMethods()")
//    public  void LoggingAdvice(JoinPoint joinPoint){
//        System.out.println(joinPoint.toString());
//    }
    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
    public void stringArgumentMethods(String name, Exception ex){
        System.out.println("A Method that takes "+name);
        System.out.println("An Exception has been thrown "+ex);
    }

    @Around("allgetters()")
    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        Object returnValue=null;
        try {
            System.out.println("Before Advice");
            proceedingJoinPoint.proceed();
            System.out.println("After Returning");
        } catch (Throwable e) {
            System.out.println("After Throwing");
            e.printStackTrace();
        }
        System.out.println("After Finally");
        return returnValue;
    }

    @Pointcut("execution(* get*())")
   public void allgetters(){}

//    @Pointcut("within(com.javabrains.AOP.model.*)")
//    public void allCircleMethods(){}
}
