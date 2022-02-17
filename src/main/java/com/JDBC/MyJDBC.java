package com.JDBC;

import java.sql.*;

public class MyJDBC {
    public static void main(String[] args) {

        try {
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/myJDBC","root", "Milton@1994!");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from people");
//            statement.executeUpdate("delete from people where id='3'");
//            resultSet=statement.executeQuery("select * from people");
            while(resultSet.next()){
                System.out.println(resultSet.getString("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
