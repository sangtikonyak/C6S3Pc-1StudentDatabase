package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDemo {
    public  Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection connection=null;
        String url="jdbc:mysql://localhost:3306/school";
        String userName="Sangti";
        String password="Atykonyak1#";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection(url,userName,password);
        return connection;
    }
}
