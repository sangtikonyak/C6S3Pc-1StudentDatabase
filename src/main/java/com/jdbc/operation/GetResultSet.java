package com.jdbc.operation;

import com.jdbc.util.StudentDemo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetResultSet {
    public static void getAllStudent() throws SQLException, ClassNotFoundException {
        StudentDemo studentDemo=new StudentDemo();
        Connection connection= studentDemo.getConnection();
        Statement statement=connection.createStatement();
        String query="SELECT * FROM STUDENT";
        ResultSet resultSet= statement.executeQuery(query);
        System.out.println("result set from student database");
        while(resultSet.next())
        {
            String name= resultSet.getString(1);
            int age=resultSet.getInt(2);
            int rollNo=resultSet.getInt(3);
            int marks=resultSet.getInt(4);
            System.out.println(name + " " + age + " " + rollNo + " " + marks);
        }
    }
}
