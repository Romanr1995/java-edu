package com.metanit.classes.interfaces;

public class Demo {
    public static void main(String[] args) {
        Robot fedor = new Robot("Fedor", "Idle");
        Robot spot = new Robot("Spot", "Barking");

        StateOfAccount open = new StateOfAccount(1000,"OPEN");
        StateOfAccount closed = new StateOfAccount(0, "CLOSED");

        printAll(fedor, spot, open, closed);

        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(3,4);

        System.out.println(rectangle2.compareTo(rectangle1));
    }

    public static void printAll(Printable ... printables) {
        for (int i = 0; i < printables.length; i++) {
            printables[i].printMessage();
        }
    }
}
