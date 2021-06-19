package com.metanit.collect;

import java.util.Collections;
import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();

        arr.add("foo1");
        arr.add("bar2");
        arr.add("foo3");
        arr.add("bar4");
        arr.add("foo5");
        arr.add("bar6");
        arr.add("bar7");
        arr.add("foo8");
        arr.add("bar9");

        System.out.println("arr size is " + arr.size());

        for (int i = 0; i < arr.size(); ++i) {
            System.out.println(arr.get(i));
        }

        System.out.println("-".repeat(80));

        String[] a = {"foo", "bar", "zxc"};

        for (String x: a) {
            System.out.println(x);
        }

        System.out.println("-".repeat(80));

        for (String s: arr) {
            System.out.println(s);
        }
       /*
        for (Iterator<String> it = arr.iterator(); it.hasNext();) {
            String s = it.next();
            System.out.println(s);
        }*/
    }
}
