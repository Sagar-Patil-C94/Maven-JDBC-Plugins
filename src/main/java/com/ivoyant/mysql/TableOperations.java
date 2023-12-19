package com.ivoyant.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;

public class TableOperations {
    public static int createTable(Connection connection, String tableName, String columnNames) {
        try (Statement statement = connection.createStatement()) {
            statement.execute(StringConstants.createTablePrefix + tableName + StringConstants.openBraces
                    + columnNames + StringConstants.closeBraces + StringConstants.semiColon);
            return statement.getUpdateCount();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }

    public static ResultSet showTables(Connection connection, String databaseType) {
        try {
            if (Objects.equals(databaseType, StringConstants.mysql)) {
                Statement statement = connection.createStatement();
                statement.execute(StringConstants.showTable + StringConstants.semiColon);
                return statement.getResultSet();
            } else {
                Statement statement = connection.createStatement();
                statement.execute(StringConstants.postgresqlShowTables + StringConstants.semiColon);
                return statement.getResultSet();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean dropTable(Connection connection, String tableName) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(StringConstants.dropTablePrefix + tableName + StringConstants.semiColon);
            return true;
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
    }
}
