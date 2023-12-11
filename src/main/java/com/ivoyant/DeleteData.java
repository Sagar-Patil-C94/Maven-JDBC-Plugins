package com.ivoyant;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteData {
    public static int delete(Connection connection, String tabelName) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM " + tabelName);
            return statement.getUpdateCount();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }

    public static int delete(Connection connection, String tabelName, String condition) {
        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM " + tabelName + " WHERE " + condition);
            return statement.getUpdateCount();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }
}
