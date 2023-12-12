package com.ivoyant;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    static int create(Connection connection, String tableName, String columnNames) {
        try (Statement statement = connection.createStatement()) {
            statement.execute(StringConstants.createTablePrefix + tableName + StringConstants.openBraces
                    + columnNames + StringConstants.closeBraces);
            return statement.getUpdateCount();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return -1;
        }
    }
}
