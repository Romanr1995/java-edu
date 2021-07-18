package com.metanit.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @param <T> тип с которым работает DAO
 * @param <P> тип первичного ключа
 */
public abstract class AbstractDao<T, P> {

    private final Connection conn;

    public AbstractDao(Connection conn) {
        this.conn = conn;

        createTableIfNotExists();
    }

    protected Connection getConnection() {
        return conn;
    }

    protected void createTableIfNotExists() {
        final Connection conn = getConnection();

        try {
            try (PreparedStatement stmt = conn.prepareStatement(createTableSql())) {
                stmt.execute();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract String getTableName();

    public abstract List<String> getColumnList();

    public abstract void prepareForInsert(T t, PreparedStatement stmt) throws SQLException;

    protected abstract String createTableSql();

    public T findById(P id) {
        return null;
    }

    public void update(T t) {

    }

    public void create(T t) {
        Connection conn = getConnection();

        String sql = generateInsertSql();

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                prepareForInsert(t, stmt);

                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteById(P id) {

    }

    String generateInsertSql() {
        StringBuilder sb = new StringBuilder();

        sb.append("insert into ")
                .append(getTableName())
                .append(" (")
                .append(String.join(",", getColumnList()))
                .append(") values (");

        boolean first = true;
        for (int i = 0; i < getColumnList().size(); ++i) {
            if (!first)
                sb.append(",");

            first = false;
            sb.append("?");
        }

        sb.append(")");

        return sb.toString();
    }
}
