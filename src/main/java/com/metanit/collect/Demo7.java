package com.metanit.collect;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Demo7 {

    public static final int COUNT = 1_000_000;
    public static final int SEED = 34;

    public static void main(String[] args) {
        Random r = new Random(SEED);

        TreeSet<Double> dTree = generateTree();
        HashSet<Double> dHash = generateHash();

        timeToSearchRandomValuesTree(100,dTree);
        timeToSearchRandomValuesHash(100,dHash);

    }

    public static TreeSet<Double> generateTree() {
        TreeSet<Double> doubles = new TreeSet<>();
        Random random = new Random(SEED);

        for (int i = 0; i < COUNT; i++) {
            doubles.add(random.nextDouble());
        }
        return doubles;
    }

    public static HashSet<Double> generateHash() {
        HashSet<Double> hashSet = new HashSet<>();
        Random random = new Random(SEED);

        for (int i = 0; i < COUNT; i++) {
            hashSet.add(random.nextDouble());
        }
        return hashSet;
    }

    public static void timeToSearchRandomValuesTree(int n,TreeSet<Double> doubles) {
        Random random = new Random(SEED);
        int c = 0;
        double[] d = new double[doubles.size()];
            for (Double d1: doubles) {
                d[c] = d1;
                c++;
            }
            long time = System.nanoTime();
        for (int i = 0; i < n; i++) {
            int rIdx = random.nextInt(COUNT);
            double valueToFind = d[rIdx];
            doubles.contains(valueToFind);
        }
        System.out.println("Время поиска " + n +" случайных значений TreeSet составило " + (System.nanoTime() - time) + " нс.");
    }

    public static void timeToSearchRandomValuesHash(int n,HashSet<Double> hashSet) {
        Random random = new Random(SEED);
        int c = 0;
        double[] d = new double[hashSet.size()];
        for (Double d1: hashSet) {
            d[c] = d1;
            c++;
        }
        long time1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            int rIdx = random.nextInt(COUNT);
            double valueToFind = d[rIdx];
            hashSet.contains(valueToFind);
        }
        System.out.println("Время поиска " + n +" случайных значений HashSet составило " + (System.nanoTime() - time1) + " нс.");
    }
}
