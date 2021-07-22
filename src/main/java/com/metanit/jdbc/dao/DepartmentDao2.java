package com.metanit.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.sql.ResultSet;



public class DepartmentDao2 extends AbstractDao<Department, Long> {

    public DepartmentDao2(Connection conn) {
        super(conn);
    }

    @Override
    public String getTableName() {
        return "department";
    }

    @Override
    public String getPrimaryKeyColumn() {
        return "id";
    }

    @Override
    public List<String> getColumnList() {
        return Arrays.asList("name", "manager", "category");
    }

    @Override
    public void prepareForInsertOrUpdate(Department dep, PreparedStatement stmt) throws SQLException {
        stmt.setString(1, dep.getName());
        stmt.setObject(2,dep.getManager());
        stmt.setObject(3,dep.getCategory());
    }

    @Override
    protected String createTableSql() {
        return "create table if not exists " + getTableName() + " (" +
                " id bigint AUTO_INCREMENT primary key not null," +
                " name varchar(100)," +
                " manager ," +
                " category ," +
                " )";
    }

    @Override
    protected Department getObjectFromResultSet(ResultSet rs) throws SQLException {
        return new Department(
                rs.getLong(getPrimaryKeyColumn()),
                rs.getString("name"),
                rs.getObject("manager"),
                rs.getObject("category")
        );
    }
}
