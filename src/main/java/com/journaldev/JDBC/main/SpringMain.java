package com.journaldev.JDBC.main;

import com.journaldev.JDBC.dao.EmployeeDAO;
import com.journaldev.JDBC.model.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Random;

public class SpringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("journaldev.xml");
        EmployeeDAO employeeDAO= (EmployeeDAO) context.getBean("employeeDAO");
        Employee employee=new Employee();
        int rand=new Random().nextInt(1000);
        employee.setId(rand);
        employee.setName("Milton Kabir");
        employee.setRole("Junior Software Engineer");

        employeeDAO.save(employee);

        Employee emp1=employeeDAO.getById(rand);
        System.out.println("Employee Retrieved::"+emp1);

        employee.setRole("CEO");
        employeeDAO.update(employee);

        List<Employee> employeeList=employeeDAO.getAll();
        System.out.println(employeeList);

        employeeDAO.deleteById(rand);

        context.close();
        System.out.println("DONE");
    }

}
