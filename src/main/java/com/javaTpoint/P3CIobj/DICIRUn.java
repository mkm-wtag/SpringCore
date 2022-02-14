package com.javaTpoint.P3CIobj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DICIRUn {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("javaTpoint.xml");
        Employee employee= (Employee) context.getBean("employee");
        System.out.println(employee.toString());
    }
}
