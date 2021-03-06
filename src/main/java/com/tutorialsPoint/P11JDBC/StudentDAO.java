package com.tutorialsPoint.P11JDBC;
import javax.sql.DataSource;
import java.util.List;

public interface StudentDAO {
    public void setDataSource(DataSource dataSource);
    public void create(String name, Integer age);
    public Student getStudent(Integer id);
    public List<Student> listStudents();
    public void delete(Integer id);
    public void update(Integer id, Integer age);

}
