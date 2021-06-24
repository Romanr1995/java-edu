package com.metanit.collect;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DemoCode5Test {

    @Test
    public void shouldSortArray() {
        String[] strings = {"foo", "bar", "abc", "xyz"};
        DemoCode5.sortByTree(strings);

        assertArrayEquals(new String[]{"abc", "bar", "foo", "xyz"}, strings);
    }

    @Test
    public void shouldPlaceNullsForDuplicates() {
        String[] strings = {"foo", "foo", "abc", "xyz", "abc", "bar"};

        DemoCode5.sortByTree(strings);

        assertArrayEquals(
                new String[]{"abc", "bar", "foo", "xyz", null, null},
                strings
        );
    }

    @Test
    public void comparisonOfFunctionExecutionTime() {
        String[] s = DemoCode5.generateArrString();
        long time = System.nanoTime();
        Arrays.sort(s);
        long currentTime = System.nanoTime() - time;

        long time1 = System.currentTimeMillis();
        DemoCode5.sortByTree(s);
        long currentTime1 = System.nanoTime() - time1;

        assert currentTime > currentTime1;
    }

}