package com.metanit.collect;

import java.util.ArrayList;
import java.util.Random;

public class DemoCode2 {

    public static final int COUNT = 10_000_000;

    public static void main(String[] args) {
        fill1();
        fill2();
    }

    public static void fill1() {
        Random r = new Random();
        ArrayList<Double> doubles = new ArrayList<Double>();
        long time = System.currentTimeMillis();//время в текущий момент
        for (int i = 0; i < COUNT; i++) {
            doubles.add(r.nextDouble());
        }
        System.out.println("Время исполнения fill1 " + (System.currentTimeMillis() - time));
    }

    public static void fill2() {
        Random r = new Random();
        ArrayList<Double> doubles = new ArrayList<Double>();
        long time = System.currentTimeMillis();//время в текущий момент
        doubles.ensureCapacity(COUNT);
        for (int i = 0; i < COUNT; i++) {
            doubles.add(r.nextDouble());
        }
        System.out.println("Время исполнения fill2 " + (System.currentTimeMillis() - time));
    }
}
