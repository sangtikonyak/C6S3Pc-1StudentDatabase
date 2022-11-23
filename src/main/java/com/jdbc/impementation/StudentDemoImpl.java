package com.jdbc.impementation;

import com.jdbc.operation.GetResultSet;
import com.jdbc.util.StudentDemo;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentDemoImpl {
    public static void main(String[] args) {
        StudentDemo studentDemo=new StudentDemo();
        try {
            Connection connection = studentDemo.getConnection();
            if(connection != null)
            {
                System.out.println("Connection Established");
            }
            else
            {
                System.out.println("Connection Failed");
            }
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        try {
            GetResultSet.getAllStudent();
        }catch (SQLException | ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
