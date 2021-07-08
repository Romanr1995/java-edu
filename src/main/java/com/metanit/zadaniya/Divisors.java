package com.metanit.zadaniya;

public class Divisors {

    public static void main(String[] args) {
        System.out.println(numberOfDivisors(3));
    }

    public static int numberDecomposition(int number) {
        int divirsors = 0;

        for (int i = 1; i <= number; i++) {
            if (number%i == 0) {
                divirsors++;
            }
        }
        return divirsors;
    }

    public static int numberOfDivisors(int divirsors) {
        int i = 1;
        int c = 1;

        while (c != divirsors){
            for (i = 1; i < Math.pow(10,15) + 1; i++) {
                for (int k = 1; k <= i; k++) {
                    if (i%k == 0) {
                        c++;
                    }
                }
            }
        }
        return i;
    }
}
