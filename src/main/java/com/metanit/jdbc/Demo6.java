package com.metanit.jdbc;

import java.sql.Connection;
import java.util.Arrays;
import com.metanit.jdbc.dao.Category;
import com.metanit.jdbc.dao.Department;
import com.metanit.jdbc.dao.DepartmentDao2;

public class Demo6 {
    public static void main(String[] args) throws Exception {
        Connection conn = ConnectionManager.getConnection();

        DepartmentDao2 dao = new DepartmentDao2(conn);

        Department sales = new Department("Sales", Category.SALES);
        Department dev = new Department("Development", Category.IT);
        Department ops = new Department("Operations", Category.IT);

        dao.create(sales);
        dao.create(dev);
        dao.create(ops);


        System.out.println(Arrays.asList(sales, dev, ops));

        System.out.println(dao.findById(3L).orElseThrow());

        ops.setName("DevOps");

        dao.update(ops);

        System.out.println(dao.findById(ops.getId()).orElseThrow());

        dao.deleteById(3L);

        dao.findById(3L).orElseThrow();
    }
}
