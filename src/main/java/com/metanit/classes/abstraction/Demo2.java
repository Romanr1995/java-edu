package com.metanit.classes.abstraction;

public class Demo2 {
    public static void main(String[] args) {
        Summa summa = new Summa();
        Minus minus = new Minus();
        Multiplying multiplying = new Multiplying();
        Division division = new Division();

        System.out.println(summa.apply(5,6));
        System.out.println(minus.apply(4,5));
        System.out.println(multiplying.apply(1,8));
        System.out.println(division.apply(2,7));

    }
}
