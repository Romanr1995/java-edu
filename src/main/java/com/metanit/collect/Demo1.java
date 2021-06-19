package com.metanit.collect;

public class Demo1 {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();

        arr.add("foo");
        arr.add("bar");
        arr.add("foo");
        arr.add("bar");
        arr.add("foo");
        arr.add("bar");
        arr.add("bar");
        arr.add("foo");
        arr.add("bar");

        System.out.println("arr size is " + arr.size());

        for (int i = 0; i < arr.size(); ++i) {
            System.out.println(arr.get(i));
        }
    }
}
