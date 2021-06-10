package com.metanit.classes.abstraction;

public class SavingsAccount extends Accounts {

    private double interestRate;

    public SavingsAccount(String type, String currency, double balance, double interestRate) {
        super(type, currency, balance);

        this.interestRate = interestRate;
    }

    @Override
    public String accountInformation() {
        return  getType() +  " account; currency " + getCurrency() + '\n' +
                "Balance = " + getBalance() + '\n' +
                "% rate = " + interestRate + " %;" + '\n';
    }
}
