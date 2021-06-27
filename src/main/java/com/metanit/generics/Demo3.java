package com.metanit.generics;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        List rawList = new ArrayList();


        strings.add("foo");
        //strings.add(10);

        rawList.add("fo0");
        rawList.add(12);
        rawList.add(new Object());


        List rawList2 = strings;

        rawList2.add(12);
        rawList2.add(new Object());

        String s1 = strings.get(0);
        String s = strings.get(1);

        Object o = 12;

        String ss = (String) o;
    }
}
