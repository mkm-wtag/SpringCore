package com.journaldev.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Aspect
public class EmployeeAspectJointPoint {
    @Before("execution(public void com.journaldev.AOP.model..set*(*))")
    public void loggingAdvice(JoinPoint joinPoint){
        System.out.println("Before Running loggingAdvice on method= "+joinPoint.toString());
        System.out.println("Arguments Passed= "+ Arrays.toString(joinPoint.getArgs()));
    }

    @Before("args(name)")
    public void logStringArguments(String name){
        System.out.println("sting argument passed= "+name);
    }

}
