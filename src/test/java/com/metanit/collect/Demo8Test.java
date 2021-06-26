package com.metanit.collect;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Demo8Test {

    @Test
    public void должноБыть2ОбщихЭлемента() {
        HashSet<String> strings1 = new HashSet<>(asList("foo", "rty", "bar", "uyt"));
        HashSet<String> strings2 = new HashSet<>(asList("trr", "uyt", "rgeewg", "foo"));

        HashSet<String> res = Demo8.intersection(strings1, strings2);

        assertEquals(new HashSet<>(asList("foo", "uyt")), res);//assert res.equals(new HashSet<>(asList("foo", "uyt")));
    }

    @Test
    public void должноБыть0ОбщихЭлементов() {
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

        assertEquals(new HashSet<>(), res);
    }

    @Test
    public void shouldBeEmpty() {
        HashSet<String> strings1 = new HashSet<>();
        HashSet<String> strings2 = new HashSet<>();

        strings1.add("foo");
        strings1.add("rty");
        strings1.add("bar");
        strings1.add("uyt");


        HashSet<String> res = Demo8.intersection(strings1, strings2);

        assertEquals(new HashSet<String>(), res);
    }
}
