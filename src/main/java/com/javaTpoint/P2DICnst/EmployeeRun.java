package com.javaTpoint.P2DICnst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeRun {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("javaTpoint.xml");
        Employee employee= (Employee) context.getBean("employee");
        System.out.println(employee.toString());
    }
}
