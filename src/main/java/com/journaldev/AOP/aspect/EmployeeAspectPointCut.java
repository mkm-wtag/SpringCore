package com.journaldev.AOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointCut {
    @Before("getNamePointCut()")
    public void loggingAdvice(){
        System.out.println("Executing loggingAdvice on getName()");
    }

    @Before("getNamePointCut()")
    public void secondAdvice(){
        System.out.println("Executing secondAdvice on getName()");
    }

    @Pointcut("execution(public String getName())")
    public  void getNamePointCut(){}

    @Before("allMethodsPointCut()")
    public void allServiceMethodsAdvice(){
        System.out.println("Before executing service method");
    }

    @Pointcut("within(com.journaldev.AOP.service.*)")
    public void allMethodsPointCut(){}

}
