package com.JDBC;

import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {

        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-video","root", "Milton@1994!");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from people");
            while(resultSet.next()){
                System.out.println(resultSet.getString("firstname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
