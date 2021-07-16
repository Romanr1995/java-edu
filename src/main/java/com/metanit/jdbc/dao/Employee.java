package com.metanit.jdbc.dao;

import java.sql.Date;

public class Employee {
    private  long id;
    private String login;
    private String password;
    private Date registrationDate;

    public Employee(long id, String login, String password, Date registrationDate) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    public long getId() {
        return id;
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
}
