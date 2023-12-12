package com.ivoyant;

import java.sql.Connection;
import java.sql.Statement;

public class DropTable {
    public static int drop(Connection connection, String tableName) {
        try {
            Statement statement = connection.createStatement();
            statement.execute(StringConstants.dropTablePrefix + tableName);
            return 1;
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return 0;
        }
    }
}
