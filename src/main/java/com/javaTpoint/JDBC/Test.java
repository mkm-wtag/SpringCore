package com.javaTpoint.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao dao= (EmployeeDao) context.getBean("edao");
        List<Employee> list=dao.getAllEmployees();
        for(Employee e:list){
            System.out.println(e);
        }
    }
}
