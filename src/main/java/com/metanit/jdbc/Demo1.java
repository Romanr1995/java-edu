package com.metanit.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "roman", "12345");

        Statement stmt = conn.createStatement();

        stmt.execute("Create table myTable (id int)");

        conn.close();
    }
}
