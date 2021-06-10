package com.metanit.classes;

public class BankAccount {
    String currency;
    long balance;
    int openingDate;

    BankAccount(String currency_,
                long balance_,
                int openingDate_) {

        currency = currency_;
        balance = balance_;
        openingDate = openingDate_;
    }
}
