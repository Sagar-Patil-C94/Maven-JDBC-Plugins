package com.ivoyant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ShowTables {
    public static ResultSet show(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("SHOW TABLES");
            return statement.getResultSet();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
}
