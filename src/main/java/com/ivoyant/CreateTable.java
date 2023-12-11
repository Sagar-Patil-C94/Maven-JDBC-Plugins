package com.ivoyant;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTable {
    static int create(Connection connection, String tableName, String columnNames) {
        try (Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS " + tableName + "(" + columnNames + ")");
            return statement.getUpdateCount();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
