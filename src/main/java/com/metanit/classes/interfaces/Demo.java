package com.metanit.classes.interfaces;

public class Demo {
    public static void main(String[] args) {
        Robot fedor = new Robot("Fedor", "Idle");
        Robot spot = new Robot("Spot", "Barking");

        StateOfAccount open = new StateOfAccount(1000,"OPEN");
        StateOfAccount closed = new StateOfAccount(0, "CLOSED");

        printAll(fedor, spot, open, closed);
    }

    public static void printAll(Printable ... printables) {
        for (int i = 0; i < printables.length; i++) {
            printables[i].printMessage();
        }
    }
}
