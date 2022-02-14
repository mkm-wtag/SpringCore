package com.javaTpoint.P1Basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentRun {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("javaTpoint.xml");
        Student student= (Student) context.getBean("studentbean");
        System.out.println(student.toString());
    }
}
