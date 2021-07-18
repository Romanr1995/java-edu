package com.metanit.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class JournalRecordDao2 extends AbstractDao<JournalRecord, Long> {

    public JournalRecordDao2(Connection conn) {
        super(conn);
    }

    @Override
    public String getTableName() {
        return "journal";
    }

    @Override
    public List<String> getColumnList() {
        return Arrays.asList("id", "title", "body", "author", "from_date");
    }

    @Override
    public void prepareForInsert(JournalRecord record, PreparedStatement stmt) throws SQLException {
        stmt.setLong(1, record.getId());
        stmt.setString(2, record.getTitle());
        stmt.setString(3, record.getBody());
        stmt.setString(4, record.getAuthor());
        stmt.setDate(5, record.getFromDate());
    }

    @Override
    protected String createTableSql() {
        return "create table if not exists " + getTableName()  + " (" +
                " id int primary key auto_increment," +
                " title varchar(100)," +
                " body varchar(4000)," +
                " author varchar(100), " +
                " from_date date" +
                " )";
    }
}
