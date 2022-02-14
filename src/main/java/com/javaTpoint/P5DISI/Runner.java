package com.javaTpoint.P5DISI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("javaTpoint.xml");
        Employee employee= (Employee) context.getBean("ee");
        System.out.println(employee.toString());
    }
}
