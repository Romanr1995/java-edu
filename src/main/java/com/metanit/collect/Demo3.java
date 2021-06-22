package com.metanit.collect;

import java.util.Random;
import java.util.TreeSet;

public class Demo3 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("foo");
        set.add("bar");
        set.add("xyz");

        for (String s: set) {//for_each
            System.out.println(s);
        }

        TreeSet<Long> longs = new TreeSet<>();

        Random r = new Random();

        for (int i = 0; i < 10000; i++) {
            longs.add(r.nextLong());
        }

        System.out.println("-".repeat(80));
        for (Long l : longs) {
            //System.out.println(l);
        }


        TreeSet<Data> dataSet = new TreeSet<>();

        dataSet.add(new Data(10, false));
    }

    static class Data {
        int num;
        boolean f;

        public Data(int num, boolean f) {
            this.num = num;
            this.f = f;
        }
    }
}
