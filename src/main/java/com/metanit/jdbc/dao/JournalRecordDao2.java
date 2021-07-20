package com.metanit.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public String getPrimaryKeyColumn() {
        return "id";
    }

    @Override
    public List<String> getColumnList() {
        return Arrays.asList("title", "body", "author", "from_date");
    }

    @Override
    public void prepareForInsertOrUpdate(JournalRecord record, PreparedStatement stmt) throws SQLException {
        stmt.setString(1, record.getTitle());
        stmt.setString(2, record.getBody());
        stmt.setString(3, record.getAuthor());
        stmt.setDate(4, record.getFromDate());
    }

    @Override
    protected String createTableSql() {
        return "create table if not exists " + getTableName() + " (" +
               " id bigint AUTO_INCREMENT primary key not null," +
               " title varchar(100)," +
               " body varchar(4000)," +
               " author varchar(100)," +
               " from_date date" +
               " )";
    }

    @Override
    protected JournalRecord getObjectFromResultSet(ResultSet rs) throws SQLException {
        return new JournalRecord(
                rs.getLong(getPrimaryKeyColumn()),
                rs.getString("title"),
                rs.getString("body"),
                rs.getString("author"),
                rs.getDate("from_date")
        );
    }
}
