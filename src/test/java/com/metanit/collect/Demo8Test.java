package com.metanit.collect;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Demo8Test {

    @Test
    public void shouldThereAreMatches() {
        HashSet<String> strings1 = new HashSet<>();
        HashSet<String> strings2 = new HashSet<>();

        strings1.add("foo");
        strings1.add("rty");
        strings1.add("bar");
        strings1.add("uyt");

        strings2.add("trr");
        strings2.add("uyt");
        strings2.add("rgeewg");
        strings2.add("foo");

        HashSet<String> res = Demo8.intersection(strings1, strings2);
        String[] str = new String[res.size()];
        int b = 0;
        for (String s : res) {
            str[b] = s;
            b++;
        }

        String[] a = {"uyt", "foo"};

        assertArrayEquals(a, str);
    }

    @Test
    public void shouldThereAreNoMatches() {
        HashSet<String> strings1 = new HashSet<>();
        HashSet<String> strings2 = new HashSet<>();

        strings1.add("foo");
        strings1.add("rty");
        strings1.add("bar");
        strings1.add("uyt");

        strings2.add("trr");
        strings2.add("udfyt");
        strings2.add("foyto");

        HashSet<String> res = Demo8.intersection(strings1, strings2);
        String[] str = new String[res.size()];
        int b = 0;
        for (String s : res) {
            str[b] = s;
            b++;
        }

        String[] a = {};

        assertArrayEquals(a, str);
    }

    @Test
    public void shouldEmptyHash() {
        HashSet<String> strings1 = new HashSet<>();
        HashSet<String> strings2 = new HashSet<>();

        strings1.add("foo");
        strings1.add("rty");
        strings1.add("bar");
        strings1.add("uyt");


        HashSet<String> res = Demo8.intersection(strings1, strings2);
        String[] str = new String[res.size()];
        int b = 0;
        for (String s : res) {
            str[b] = s;
            b++;
        }

        String[] a = {};

        assertArrayEquals(a, str);
    }
}
