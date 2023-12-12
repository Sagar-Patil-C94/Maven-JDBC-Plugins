package com.ivoyant;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayData {
    public static ResultSet display(Connection connection, String columnNames, String tableName) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(StringConstants.selectPrefix + columnNames + StringConstants.fromClause + tableName);
            return statement.getResultSet();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
}
