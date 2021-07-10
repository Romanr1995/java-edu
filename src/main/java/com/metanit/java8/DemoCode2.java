package com.metanit.java8;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DemoCode2 {
    public static final int SIZE = 10_000_000;

    public static void main(String[] args) {

        List<Integer> ints = generate();

        //collect values without repeats:
        // a) from 20_000 to 50_000
        // b) sum of digits < 10
        List<Integer> integers = ints.stream()
                .filter(a -> a >= 20_000 && a <= 50_000)
                .filter(sum -> sumOfDigits(sum) < 10)
                .distinct()
                .collect(Collectors.toList());

        Runnable task1 = () -> {
            ints.stream()
                    .filter(a -> a >= 20_000 && a <= 50_000)
                    .filter(sum -> sumOfDigits(sum) < 10)
                    .distinct()
                    .collect(Collectors.toList());
        };


        Runnable task2 = () -> {
            ints.stream()
                    .filter(sum -> sumOfDigits(sum) < 10)
                    .filter(a -> a >= 20_000 && a <= 50_000)
                    .distinct()
                    .collect(Collectors.toList());
        };

        Runnable task3 = () -> {
            ints.stream()
                    .distinct()
                    .filter(a -> a >= 20_000 && a <= 50_000)
                    .filter(sum -> sumOfDigits(sum) < 10)
                    .collect(Collectors.toList());
        };

        Runnable taskStringEdition = () -> {
            ints.stream()
                    .filter(a -> a >= 20_000 && a <= 50_000)
                    .filter(sum -> sumOfDigitsString(sum) < 10)
                    .distinct()
                    .collect(Collectors.toList());
        };

        printExecutionTime(task1, "task1");
        printExecutionTime(task2, "task2");
        printExecutionTime(task3, "task3");
        printExecutionTime(taskStringEdition, "taskStringEdition");
    }

    public static void printExecutionTime(Runnable runnable, String taskName) {
        long l = System.currentTimeMillis();

        runnable.run();

        System.out.println(taskName + ": " + (System.currentTimeMillis() - l));
    }

    public static int sumOfDigits(int number) {
        //5445
        int sum = 0;

        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);

        return sum;
    }

    public static int sumOfDigitsString(int number) {
        int sum = 0;
        String s = String.valueOf(number);

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        return sum;
    }

    static List<Integer> generate() {
        Random r = new Random();

        return r.ints(SIZE, 0, 100_000)
                .boxed()
                .collect(Collectors.toList());
    }
}
