package com.metanit.classes.interfaces;

public class StateOfAccount implements Printable, Comparable<StateOfAccount> {
    public static final String OPENED = "OPENED";
    public static final String CLOSED = "CLOSED";
    private int currentBalance;
    private String status;//OPEN, CLOSED

    public StateOfAccount(int currentBalance, String status) {
        this.currentBalance = currentBalance;
        this.status = status;
    }

    @Override
    public void printMessage() {
        System.out.println("Account is " + status + " current balance is " + currentBalance);
    }


    /**
     * First OPENED accounts
     * Then Closed accounts
     * If statuses are same then sort by balance descending
     */
    @Override
    public int compareTo(StateOfAccount that) {
        // A > B -> B < A
        //if this > that -> return 1(any value > 0);
        //if this == that -> return 0;
        //if this < that -> return -1(any value < 0);
        if (this.status.equals(that.status)) {
            if (this.currentBalance > that.currentBalance) {
                return -1;
            } else if (this.currentBalance < that.currentBalance) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (this.status.equals(OPENED)) {
                return -1;
            } else if (this.status.equals(CLOSED) && that.status.equals(OPENED)) {
                return 1;
            }
        }

        return 0;
    }

    @Override
    public String toString() {
        return "StateOfAccount{" +
                "currentBalance=" + currentBalance +
                ", status='" + status + '\'' +
                '}';
    }
}
