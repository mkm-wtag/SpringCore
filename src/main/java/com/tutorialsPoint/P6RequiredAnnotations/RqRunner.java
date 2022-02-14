package com.tutorialsPoint.P6RequiredAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RqRunner {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("tutorialsPointBeans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
}
