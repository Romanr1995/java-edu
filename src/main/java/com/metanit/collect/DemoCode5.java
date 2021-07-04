package com.metanit.collect;

import java.util.*;

public class DemoCode5 {
    public static final int COUNT = 1_000_000;

    public static void main(String[] args) {
        Random r = new Random();

        String[] s = generateArrString();
        long time = System.currentTimeMillis();
        Arrays.sort(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }


        System.out.println("Исполнение Arrys.sort заняло " + (System.currentTimeMillis() - time) + " мсек.");

        String[] s2 = generateArrString();
        long time1 = System.currentTimeMillis();
        sortByTree(s2);
        System.out.println("Исполнение sortByTree заняло " + (System.currentTimeMillis() - time1) + " мсек.");

    }

    public static void sortByTree(String[] strings) {
        TreeSet<String> set = new TreeSet<>();


        for (int i = 0; i < strings.length; i++) {
            set.add(strings[i]);
        }
        int k = 0;
        for (String s: set) {
            strings[k++] = s;
        }

        for (; k < strings.length; ++k) {
            strings[k] = null;
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
        for (int i = 0; i < COUNT; i++) {
            result[i] = (Integer.toString(r.nextInt()));
        }
        return result;
    }
}
