package com.metanit.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

/**
 * @param <T> тип с которым работает DAO
 * @param <P> тип первичного ключа
 */
public abstract class AbstractDao<T extends AbstractEntity<P>, P> {

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

    public abstract String getPrimaryKeyColumn();

    public abstract List<String> getColumnList();

    public abstract void prepareForInsertOrUpdate(T t, PreparedStatement stmt) throws SQLException;

    protected abstract String createTableSql();

    protected abstract T getObjectFromResultSet(ResultSet rs) throws SQLException;

    public Optional<T> findById(P id) {
        String sql = generateSelectSql();

        Connection conn = getConnection();

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setObject(1, id);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    return Optional.of(getObjectFromResultSet(rs));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty();
    }

    public void update(T t) {
        if (t.getId() == null)
            throw new RuntimeException("Нельзя обновить объект без id");

        String sql = generateUpdateSql();

        Connection conn = getConnection();

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                prepareForInsertOrUpdate(t, stmt);
                stmt.setObject(getColumnList().size() + 1, t.getId());

                int rows = stmt.executeUpdate();

                if (rows != 1)
                    throw new RuntimeException("Ожидалось, что обновится 1 строка, но обновилось " + rows);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void create(T t) {
        if (t.getId() != null) {
            throw new RuntimeException("Вставка в бд объекта с не-null id запрещена");
        }

        Connection conn = getConnection();

        String sql = generateInsertSql();

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql, new String[]{getPrimaryKeyColumn()})) {
                prepareForInsertOrUpdate(t, stmt);

                int rows = stmt.executeUpdate();

                if (rows != 1)
                    throw new RuntimeException("Ожидалось, что вставится 1 новая строка, но получилось " + rows);

                ResultSet generatedKeys = stmt.getGeneratedKeys();

                while (generatedKeys.next()) {
                    t.setId((P) generatedKeys.getObject("id"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteById(P id) {
        String sql = generateDeleteSql();
        Connection conn = getConnection();

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setObject(1, id);
                int rows = stmt.executeUpdate();

                if (rows != 1)
                    throw new RuntimeException("Ожидалось, что удалится 1 строка, но удалилось " + rows);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //todo дз
    public long tableSize() {
        //метод возвращает размер таблицы
        //select count(*) from <table_name>
        Connection conn = getConnection();
        String sql = "select count(*) from " + getTableName();


        return 0;
    }

    //todo дз
    public boolean containsId(P id) {
        String sql = "select count(*) from " + getTableName() + " where id = ?";//возможно 2 исхода: 0 или 1
        Connection conn = getConnection();

        try {
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setObject(1, id);

                ResultSet rs = stmt.executeQuery();

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.empty().isEmpty();
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

    String generateSelectSql() {
        //select col_pk, col1, col2, col3 ... from table_name where col_pk = ?
        StringBuilder sb = new StringBuilder();

        sb.append("select ")
          .append(getPrimaryKeyColumn()).append(",")
          .append(String.join(",", getColumnList()))
          .append(" from ").append(getTableName())
          .append(" where ")
          .append(getPrimaryKeyColumn()).append(" = ?");

        return sb.toString();
    }

    String generateUpdateSql() {
        //update table_name set col1 = ?, col2 = ?, col3 = ? where col_pk = ?

        StringBuilder sb = new StringBuilder();

        sb.append("update ")
          .append(getTableName())
          .append(" set ")
          .append(String.join("=?,", getColumnList()))
          .append("=?")
          .append(" where ").append(getPrimaryKeyColumn()).append("=?");

        return sb.toString();
    }

    String generateDeleteSql() {
        //delete from table_name where col_pk = ?
        StringBuilder sb = new StringBuilder();
        sb.append("delete from ").append(getTableName())
          .append(" where ")
          .append(getPrimaryKeyColumn()).append("=?");


        return sb.toString();
    }
}
