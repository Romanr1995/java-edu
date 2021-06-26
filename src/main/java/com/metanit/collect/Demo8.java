package com.metanit.collect;

import java.util.HashSet;

public class Demo8 {

    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<>();
        HashSet<String> s2 = new HashSet<>();

        s1.add("foo");
        s1.add("bar");
        s1.add("abc");
        s1.add("zzz");

        s2.add("foo");
        s2.add("baz");
        s2.add("zzz");
        s2.add("xyz");
        s2.add("abc");
        s2.add("rrhrr");

        System.out.println(intersection(s1,s2));
    }

    public static HashSet<String> intersection(HashSet<String> lhs, HashSet<String> rhs) {
        HashSet<String> result = new HashSet<>();

        /* как не надо делать!
        int c = 0;
        String[] strings = new String[lhs.size()];
        for(String s: lhs) {
            strings[c] = s;
            c++;
        }

        for (int i = 0; i < lhs.size(); i++) {
            if (rhs.contains(strings[i]) == true) {
                result.add(strings[i]);
            }
        }*/

        for (String s: lhs) {
            if (rhs.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }
}
