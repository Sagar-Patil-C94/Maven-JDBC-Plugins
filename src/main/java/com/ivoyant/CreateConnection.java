package com.ivoyant;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
    static Connection connect(String hostName, int portNumber, String databaseName, String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://" + hostName + ":" + portNumber + "/" + databaseName, username, password);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
}
