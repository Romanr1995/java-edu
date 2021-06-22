package com.metanit.collect;

import java.util.*;

public class Demo4 {

    public static final int COUNT = 1_000_000;
    public static final int SEED = 42;

    public static void main(String[] args) {
        Random r = new Random();

        TreeSet<Double> dTree = generateTree();
        ArrayList<Double> dList = generateArrList();

        int rIdx = r.nextInt(COUNT);
        double valueToFind = dList.get(rIdx);//O(1)

        measureTime(
                () -> dTree.contains(valueToFind),
                "tree"
        );

        measureTime(
                () -> dList.contains(valueToFind),
                "arrayList"
        );

        dList.sort(Comparator.naturalOrder());

        measureTime(
                () -> Collections.binarySearch(dList, valueToFind),
                "arrayList binarySearch"
        );
    }


    public static TreeSet<Double> generateTree() {
        TreeSet<Double> result = new TreeSet<>();
        Random r = new Random(SEED);

        for (int i = 0; i < COUNT; i++) {
            result.add(r.nextDouble());
        }

        return result;
    }


    public static ArrayList<Double> generateArrList() {
        ArrayList<Double> result = new ArrayList<>();
        Random r = new Random(SEED);

        for (int i = 0; i < COUNT; i++) {
            result.add(r.nextDouble());
        }

        return result;
    }

    public static void measureTime(Runnable runnable, String name) {
        long curTime = System.nanoTime();

        runnable.run();

        System.out.println("Исполнение " + name + " заняло " + (System.nanoTime() - curTime) + " нс.");
    }
}
