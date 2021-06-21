package com.metanit.collect;

import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();

        ArrayList<Long> longList = new ArrayList<Long>();
        //int - Integer
        //long - Long
        //char - Character
        //boolean - Boolean
        //byte - Byte
        //short - Short
        //float - Float
        //double - Double

        longList.add(10L);

        stringList.add("foo");
        stringList.add("bar");

        System.out.println("stringList.size() = " + stringList.size());

        stringList.add(0, "xyz");

        System.out.println("stringList = " + stringList);

        {
            ArrayList<String> l1 = new ArrayList<>();

            l1.add("foo");
            l1.add("bar");

            ArrayList<String> l2 = new ArrayList<>();
            l2.add("abc");
            l2.add("test");

            l2.addAll(l1);

            System.out.println("l1 = " + l1);
            System.out.println("l2 = " + l2);
        }

    }
}
