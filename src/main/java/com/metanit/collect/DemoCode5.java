package com.metanit.collect;

import java.util.*;

public class DemoCode5 {
    public static final int COUNT = 10_000_000;

    public static void main(String[] args) {
        Random r = new Random();

        String[] s = generateArrString();
        long time = System.nanoTime();
        Arrays.sort(s);

        System.out.println("Исполнение Arrys.sort заняло " + (System.nanoTime() - time) + " нс.");

        long time1 = System.nanoTime();
        sortByTree(s);
        System.out.println("Исполнение sortByTree заняло " + (System.nanoTime() - time1) + " нс.");

    }

    public static void sortByTree(String[] strings) {
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < COUNT; i++) {
            set.add(strings[i]);
        }
        //нужно отсортировать заданный массив строк с помощьу класса TreeSet
        //замерить время выполнения и сравнить с временем выполнения Arrays.sort
    }

    public static String[] generateArrString() {
        String[] result = new String[COUNT];
        Random r = new Random();

//        for (int k = 1; k < 1000; k++) {
//            result[k] = ("a".repeat(k));
//            for (int i = 1; i < 100; i++) {
//                result[i] = ("b".repeat(i));
//                result[i] = ("k".repeat(i));
//                result[i] = ("e".repeat(i));
//                result[i] = ("u".repeat(i));
//                result[i] = ("o".repeat(i));
//                result[i] = ("p".repeat(i));
//                result[i] = ("s".repeat(i));
//                result[i] = ("w".repeat(i));
//                result[i] = ("d".repeat(i));
//                result[i] = ("m".repeat(i));
//            }
//        }
        for (int i = 0; i < 10_000_000; i++) {
            result[r.nextInt(COUNT)] = (Integer.toString(r.nextInt()));
        }
        return result;
    }
}
