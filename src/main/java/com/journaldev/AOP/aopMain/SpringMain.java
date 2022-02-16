package com.journaldev.AOP.aopMain;

import com.javaTpoint.P5DISI.Employee;
import com.journaldev.AOP.service.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("journaldev.xml");
        EmployeeService employeeService= (EmployeeService) context.getBean("employeeService");
        System.out.println(employeeService.getEmployee().getName());
        employeeService.getEmployee().setName("Milton");
        employeeService.getEmployee().throwException();
        context.close();
    }
}
