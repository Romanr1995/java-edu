package com.metanit.jdbc.dao;

import java.sql.Connection;
import com.metanit.jdbc.ConnectionManager;

public class Demo7 {
    public static void main(String[] args) throws Exception {
        Connection conn = ConnectionManager.getConnection();
        DepartmentDao2 deptDao = new DepartmentDao2(conn);

        EmployeeDao2 dao2 = new EmployeeDao2(conn, deptDao);
    }
}
