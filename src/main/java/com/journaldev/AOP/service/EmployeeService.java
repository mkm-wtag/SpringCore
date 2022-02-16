package com.journaldev.AOP.service;

import com.journaldev.AOP.model.Employee;

public class EmployeeService {

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
