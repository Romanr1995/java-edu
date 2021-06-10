package com.metanit.classes.abstraction;

public class Deposit extends Accounts {

    public Deposit(String type, String currency, double balance) {
        super(type, currency, balance);
    }

    @Override
    public String accountInformation() {
        return "Type account: " + getType() + '\n' + "Balance account: " + getBalance() + " " + getCurrency() + ";" + '\n';
    }
}
