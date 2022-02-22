package com.journaldev.JDBC.dao;

import com.journaldev.JDBC.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class EmployeeDAOJDBCTemplateImpl implements EmployeeDAO{

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(Employee employee) {
        String query="insert into Employee (id, name, role) values (?,?,?)";
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        Object[] args=new Object[]{employee.getId(), employee.getName(),employee.getRole()};
        int out=jdbcTemplate.update(query,args);

    }

    @Override
    public Employee getById(int id) {
        return null;
    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public List<Employee> getAll() {
        return null;
    }
}
