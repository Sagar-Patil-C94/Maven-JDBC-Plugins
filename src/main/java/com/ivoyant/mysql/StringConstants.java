package com.ivoyant.mysql;

public class StringConstants {
    public static final String sqlDriverName = "com.mysql.cj.jdbc.Driver";
    public static final String postgresDriverName = "org.postgresql.Driver";
    public static final String sqlUrlPrefix = "jdbc:mysql://";
    public static final String postgresqlUrlPrefix = "jdbc:postgresql://";
    public static final String colon = ":";
    public static final String forwardSlash = "/";
    public static final String deletePrefix = "DELETE FROM ";
    public static final String whereClause = " WHERE ";
    public static final String createTablePrefix = "CREATE TABLE IF NOT EXISTS ";
    public static final String openBraces = "(";
    public static final String closeBraces = ")";
    public static final String selectPrefix = "SELECT ";
    public static final String fromClause = " FROM ";
    public static final String dropTablePrefix = "DROP TABLE ";
    public static final String showTable = "SHOW TABLES";
    public static final String insertInto = "INSERT INTO ";
    public static final String values = " VALUES";
    public static final String mysql = "mysql";
    public static final String semiColon = ";";
    public static final String postgresqlShowTables = "SELECT * FROM pg_catalog.pg_tables  \n" +
            "WHERE  \n" +
            "schemaname != 'pg_catalog'  \n" +
            "AND schemaname != 'information_schema';  ";

}
