package com.metanit.collect;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class DemoCode4 {
    public static final int COUNT = 10_000_000;

    public static void main(String[] args) {
        ArrayList<Double> doubles1 = generate();
        ArrayList<Double> doubles2 = generate();

        int count = 100;

        addFromStart(doubles1,count);
        addFromEnd(doubles2,count);
        
        System.out.println(minValue(doubles1));

        double min1 = minValue(doubles1);
        doubles1.sort(Comparator.naturalOrder());
        System.out.println("(min1 == doubles1.get(0)) = " + (min1 == doubles1.get(0)));

        System.out.println(minValue(doubles2));

    }

    public static double minValue(ArrayList<Double> ar) {
        double min = ar.get(0);
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) < min) {
                min = ar.get(i);
            }
        }
        return min;
    }

    public static ArrayList<Double> generate() {
        Random r = new Random();
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.ensureCapacity(COUNT);

        for (int i = 0; i < COUNT; i++) {
            doubles.add(r.nextDouble());
        }
        return doubles;
    }

    public static void addFromStart(ArrayList<Double> ar, int count) {
        Random r = new Random();
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            ar.add(0, r.nextDouble());
        }
        System.out.println("Время выполнения функции addFromStart = " + (System.currentTimeMillis() - time));
    }

    public static void addFromEnd(ArrayList<Double> ar, int count) {
        Random r = new Random();
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            ar.add(r.nextDouble());
        }
        System.out.println("Время выполнения функции addFromEnd = " + (System.currentTimeMillis() - time));
    }
}
