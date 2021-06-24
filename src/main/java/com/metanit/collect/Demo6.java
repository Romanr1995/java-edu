package com.metanit.collect;

import java.util.HashSet;

public class Demo6 {
    public static void main(String[] args) {
        HashSet<Data> data = new HashSet<>();

        Data foo = new Data(10, "foo");
        Data foo2 = new Data(10, "foo");
        data.add(foo);

        System.out.println("data.contains(foo) = " + data.contains(foo));
        System.out.println("data.contains(foo2) = " + data.contains(foo2));
    }

    static class Data {
        int num;
        String text;

        public Data(int num, String text) {
            this.num = num;
            this.text = text;
        }
    }
}
