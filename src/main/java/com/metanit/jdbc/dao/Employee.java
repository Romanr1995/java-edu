package com.metanit.jdbc.dao;

import java.sql.Date;

public class Employee extends AbstractEntity<Long> {
    private String login;
    private String password;
    private Date registrationDate;
    private Department department;


    public Employee(String login, String password, Date registrationDate, Department department) {
        super(null);
        this.login = login;
        this.password = password;
        this.registrationDate = registrationDate;
        this.department = department;
    }

    Employee(Long id, String login, String password, Date registrationDate, Department department) {
        super(id);
        this.login = login;
        this.password = password;
        this.registrationDate = registrationDate;
        this.department = department;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}
