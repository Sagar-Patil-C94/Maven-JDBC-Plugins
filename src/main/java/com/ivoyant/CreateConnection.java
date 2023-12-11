package com.ivoyant;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
    static Connection connect(String databaseName, String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databaseName, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
