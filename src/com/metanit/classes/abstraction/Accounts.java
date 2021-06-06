package com.metanit.classes.abstraction;

import java.awt.*;

public abstract class Accounts {
    private String type;
    private String currency;
    private double balance;

    public Accounts(String type, String currency, double balance) {
        this.type = type;
        this.currency = currency;
        this.balance = balance;
    }

    public abstract String accountInformation();

    public String getType() {
        return type;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }
}
