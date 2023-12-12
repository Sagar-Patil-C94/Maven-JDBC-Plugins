package com.ivoyant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataOperations {
    public static int deleteData(Connection connection, String tableName) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(StringConstants.deletePrefix + tableName);
            return statement.getUpdateCount();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }

    public static int deleteData(Connection connection, String tableName, String condition) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(StringConstants.deletePrefix + tableName + StringConstants.whereClause + condition);
            return statement.getUpdateCount();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }

    public static ResultSet displayData(Connection connection, String columnNames, String tableName) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(StringConstants.selectPrefix + columnNames + StringConstants.fromClause + tableName);
            return statement.getResultSet();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

    public static int insertData(Connection connection, String tableName, String columnsList, String values) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(StringConstants.insertInto + tableName + columnsList + StringConstants.values +
                    values);
            return statement.getUpdateCount();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }
}
