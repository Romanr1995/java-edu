package com.metanit.collect;

import java.util.ArrayList;
import java.util.Random;

public class DemoCode3 {
    public static final int COUNT = 1_000_000;

    public static void main(String[] args) {
        ArrayList<Double> a1 = generate();
        ArrayList<Double> a2 = generate();

        int cnt = 100;

        long time = System.currentTimeMillis();
        removeFromStart(a1,cnt);
        System.out.println("Время исполнения removeFromStart " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        removeFromEnd(a2,cnt);
        System.out.println("Время исполнения removeFromEnd " + (System.currentTimeMillis() - time));
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

    public static void removeFromStart(ArrayList<Double> ar, int cnt) {
        for (int i = 0; i < cnt; i++) {
            ar.remove(0);
        }
    }

    public static void removeFromEnd(ArrayList<Double> ar, int cnt) {
        for (int i = 0; i < cnt; i++) {
            ar.remove(ar.size()-1);
        }
    }
}
