package com.ivoyant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TableOperations {
    public static int createTable(Connection connection, String tableName, String columnNames) {
        try (Statement statement = connection.createStatement()) {
            statement.execute(StringConstants.createTablePrefix + tableName + StringConstants.openBraces
                    + columnNames + StringConstants.closeBraces);
            return statement.getUpdateCount();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }

    public static ResultSet showTables(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(StringConstants.showTable);
            return statement.getResultSet();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

    public static boolean dropTable(Connection connection, String tableName) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(StringConstants.dropTablePrefix + tableName);
            return true;
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
    }
}
