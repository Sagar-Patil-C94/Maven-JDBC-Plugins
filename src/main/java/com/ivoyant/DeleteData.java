package com.ivoyant;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteData {
    public static int delete(Connection connection, String tableName) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(StringConstants.deletePrefix + tableName);
            return statement.getUpdateCount();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }

    public static int delete(Connection connection, String tableName, String condition) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(StringConstants.deletePrefix + tableName + StringConstants.whereClause + condition);
            return statement.getUpdateCount();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }
}
