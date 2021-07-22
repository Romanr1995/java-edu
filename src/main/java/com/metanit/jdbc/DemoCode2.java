package com.metanit.jdbc;

import com.metanit.jdbc.dao.Employee;
import com.metanit.jdbc.dao.EmployeeDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.List;
import java.sql.Date;

public class DemoCode2 {
    public static void main(String[] args) throws Exception{
        Connection conn = ConnectionManager.getConnection();

        try {
            conn.createStatement();

            EmployeeDao dao = new EmployeeDao(conn);

            List<Employee> employees = Arrays.asList(
                    new Employee("LoginEmp","122ghhr",new Date(2015-11-12), null),
                    new Employee("Login@mail","1234567890",new Date(2016-07-04), null),
                    new Employee("MoyLogin","111Ivan!",new Date(2020-10-07), null),
                    new Employee("PetrovGena1973","19732002",new Date(2010-10-12), null),
                    new Employee("ElenaIvanovna77","Elena1977",new Date(2009-01-12), null)
            );

            employees.forEach(dao::create);

            System.out.println("dao.findById(4) = " + dao.findById(4));

            dao.deleteById(2);

            try {
                dao.findById(1);
            } catch (Exception e) {

            }

            employees.get(4).setLogin("Alex@1974");

            dao.update(employees.get(4));

            System.out.println("dao.findById(5) = " + dao.findById(5));
        } finally {
            conn.close();
        }

    }
}
