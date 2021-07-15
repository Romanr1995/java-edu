package com.metanit.jdbc;

import java.sql.*;

public class Demo2 {
    public static void main(String[] args) throws  Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try(Connection conn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "roman", "12345"))
        {
            Statement stmt = conn.createStatement();
            String sql = "select * from employee";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                Date birthday = rs.getDate("birthday");

                System.out.println("id = " + id + "; firstName = " + firstName + "; birthday = " + birthday);
            }
        }
    }
}
