package com.metanit.jdbc.dao;

import java.sql.*;

public class EmployeeDao {

    private final Connection conn;

    public EmployeeDao(Connection conn) {
        this.conn = conn;

        try (Statement stmt = conn.createStatement()) {
            stmt.execute("create table if not exists Employee " +
                    "(id int, login varchar(100), password varchar(100), registration_date date)");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void create(Employee emp) {
        Connection conn = getConn();

        String sql = "insert into Employee (id, login, password, registration_date) values (?, ?, ?, ?)";

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setLong(1, emp.getId());
                stmt.setString(2, emp.getLogin());
                stmt.setString(3, emp.getPassword());
                stmt.setDate(4, emp.getRegistrationDate());

                stmt.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Employee findById(long id) {
        Connection conn = getConn();

        String sql = "select id, login, password, registration_date from employee where id = ?";

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setLong(1, id);

                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        return new Employee(
                                rs.getLong("id"),
                                rs.getString("login"),
                                rs.getString("password"),
                                rs.getDate("registration_date")
                        );
                    }
                    throw new RuntimeException("Record by id = " + id + " not found!");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Employee emp) {
        Connection conn = getConn();

        String sql = "update employee set" +
                " login = ?," +
                " password = ?," +
                " registration_date = ?" +
                " where id = ?";

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, emp.getLogin());
                stmt.setString(2, emp.getPassword());
                stmt.setDate(3, emp.getRegistrationDate());
                stmt.setLong(4, emp.getId());

                int i = stmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteById(long id) {
        Connection conn = getConn();

        String sql = "delete from employee where id = ?";

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setLong(1, id);

                int i = stmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
