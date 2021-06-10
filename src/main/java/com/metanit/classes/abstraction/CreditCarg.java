package com.metanit.classes.abstraction;

public class CreditCarg extends Accounts {

    private double cardLimit;

    public CreditCarg(String type, String currency, double balance, double cardLimit) {
        super(type, currency, balance);
        this.cardLimit = cardLimit;
    }

    public double remainingDebt() {
        return cardLimit - getBalance();
    }

    @Override
    public String  accountInformation() {
        return "Type account: " + getType() + '\n' + "Balance account: " + getBalance() + " " + getCurrency() + '\n' +
                "Remaining Debt = " + remainingDebt() + " " + getCurrency() + ";" + '\n';

    }
}
