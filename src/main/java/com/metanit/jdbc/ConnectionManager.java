package com.metanit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {


    public static Connection getConnection() throws Exception {
        String prop = System.getProperty("USE_H2");
        if (prop != null) {
            return getH2();
        } else {
            return getMySql();
        }
    }
    public static Connection getH2() throws Exception {
        Class.forName("org.h2.Driver");

        return DriverManager.getConnection("jdbc:h2:mem:default");
    }

    public static Connection getMySql() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "roman", "12345");
    }
}
