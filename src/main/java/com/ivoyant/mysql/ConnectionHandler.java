package com.ivoyant.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class ConnectionHandler {
    public static Connection connect(String hostName, String databaseType, int portNumber, String databaseName,
                                     String username, String password) {
        try {
            if (Objects.equals(databaseType, StringConstants.mysql)) {
                Class.forName(StringConstants.sqlDriverName);
                return DriverManager.getConnection(StringConstants.sqlUrlPrefix + hostName + StringConstants.colon +
                        portNumber + StringConstants.forwardSlash + databaseName, username, password);
            } else {
                Class.forName(StringConstants.postgresDriverName);
                return DriverManager.getConnection(StringConstants.postgresqlUrlPrefix + hostName +
                        StringConstants.colon + portNumber + StringConstants.forwardSlash + databaseName, username, password);
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }
    public static boolean disconnect(Connection connection) {
        try {
            connection.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
