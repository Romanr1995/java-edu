package com.metanit.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class EmployeeDao2 extends AbstractDao<Employee, Long> {
    private final DepartmentDao2 deptDao;

    public EmployeeDao2(Connection conn, DepartmentDao2 deptDao) {
        super(conn);
        this.deptDao = deptDao;
    }

    @Override
    public String getTableName() {
        return "employee";
    }

    @Override
    public String getPrimaryKeyColumn() {
        return "id";
    }

    @Override
    public List<String> getColumnList() {
        return Arrays.asList("login", "pwd", "registration_date", "dept_id");
    }

    @Override
    public void prepareForInsertOrUpdate(Employee emp, PreparedStatement stmt) throws SQLException {
        stmt.setString(1, emp.getLogin());
        stmt.setString(2, emp.getPassword());
        stmt.setDate(3, emp.getRegistrationDate());
        stmt.setLong(4, emp.getDepartment().getId());
    }

    @Override
    protected String createTableSql() {
        return "create table if not exists " + getTableName() +
               " (id bigint auto_increment primary key," +
               " login varchar(100) not null," +
               " pwd varchar(100) not null," +
               " registration_date date not null," +
               " dept_id bigint, " +
               " constraint employee_dept_fk foreign key (dept_id)" +
               " references department(id))";
    }

    @Override
    protected Employee getObjectFromResultSet(ResultSet rs) throws SQLException {
        return new Employee(
                rs.getLong("id"),
                rs.getString("login"),
                rs.getString("pwd"),
                rs.getDate("registration_date"),
                deptDao.findById(rs.getLong("dept_id")).orElseThrow(() -> new RuntimeException("не найден департамент"))
        );
    }
}
