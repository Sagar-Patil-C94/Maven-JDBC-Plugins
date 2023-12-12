package com.ivoyant;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHandler {
    public static Connection connect(String hostName, int portNumber, String databaseName, String username, String password) {
        try {
            Class.forName(StringConstants.driverName);
            return DriverManager.getConnection(StringConstants.urlPrefix + hostName + StringConstants.colon +
                            portNumber + StringConstants.forwardSlash + databaseName,
                    username, password);
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
