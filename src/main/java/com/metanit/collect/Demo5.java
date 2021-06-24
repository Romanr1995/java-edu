package com.metanit.collect;

import java.util.HashSet;

public class Demo5 {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();

        boolean b;
        b = strings.add("foo");
        b = strings.add("bar");
        b = strings.add("abc");
        b = strings.add("xyz");


        for (String s : strings) {
            System.out.println(s);
        }

        strings.add("ff");
        strings.add("28");
        strings.add("1");
        strings.add("66");
        strings.add("acuet");
        strings.add("acehet");
        strings.add("acehu");
        strings.add("acehue1");
        strings.add("acehue");

        System.out.println("-".repeat(80));

        for (String s : strings) {
            System.out.println(s);
        }

        String s1 = "foo";
        String s2 = new String("foo");

        System.out.println("(s1 == s2) = " + (s1 == s2));
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s2.equals(s1) = " + s2.equals(s1));
    }
}
