package com.ivoyant;

import java.sql.Connection;
import java.sql.Statement;

public class DropTable {
    public static boolean drop(Connection connection, String tableName) {
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
