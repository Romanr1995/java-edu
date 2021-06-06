package com.metanit.classes.abstraction;

public class Demo1 {
    public static void main(String[] args) {
        Deposit dep = new Deposit("Depisit","USD",10_000);
        SavingsAccount savings = new SavingsAccount("Savings","RUR",1_200_500,5.4);
        CreditCarg cc = new CreditCarg("Credit card","RUR",350_000,500_000);


        infoAccounts(dep,savings,cc);
    }

    public static void infoAccounts(Accounts... accounts) {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].accountInformation());
        }
    }
}
