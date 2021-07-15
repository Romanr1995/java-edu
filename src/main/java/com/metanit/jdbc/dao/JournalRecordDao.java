package com.metanit.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JournalRecordDao {

    private final Connection conn;

    public JournalRecordDao(Connection conn) {
        this.conn = conn;


        try (Statement stmt = conn.createStatement()) {
            stmt.execute("create table if not exists JOURNAL " +
                    "(id int, title varchar(100), body varchar(4000), author varchar(100), from_date date)");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Connection getConnection() {
        return conn;
    }

    public void create(JournalRecord rec) {
        Connection conn = getConnection();

        String sql = "insert into JOURNAL (id, title, body, author, from_date) values (?, ?, ?, ?, ?)";

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setLong(1, rec.getId());
                stmt.setString(2, rec.getTitle());
                stmt.setString(3, rec.getBody());
                stmt.setString(4, rec.getAuthor());
                stmt.setDate(5, rec.getFromDate());

                stmt.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public JournalRecord findById(long id) {
        Connection conn = getConnection();

        String sql = "select id, title, body, author, from_date from journal where id = ?";

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setLong(1, id);

                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        return new JournalRecord(
                                rs.getLong("id"),
                                rs.getString("title"),
                                rs.getString("body"),
                                rs.getString("author"),
                                rs.getDate("from_date")
                        );
                    }
                    throw new RuntimeException("Record by id = " + id + " not found!");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(JournalRecord rec) {
        Connection conn = getConnection();

        String sql = "update journal set" +
                " title = ?," +
                " body = ?," +
                " author = ?," +
                " from_date = ?" +
                " where id = ?";


        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setString(1, rec.getTitle());
                stmt.setString(2, rec.getBody());
                stmt.setString(3, rec.getAuthor());
                stmt.setDate(4, rec.getFromDate());
                stmt.setLong(5, rec.getId());

                int i = stmt.executeUpdate();//todo обсудить
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public void deleteById(long id) {
        Connection conn = getConnection();

        String sql = "delete from journal where id = ?";

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setLong(1, id);

                int i = stmt.executeUpdate();//todo обсудить
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
