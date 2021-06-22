package com.metanit.collect;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoCode5Test {

    @Test
    public void shouldSortArray() {
        String[] strings = {"foo", "bar", "abc", "xyz"};
        DemoCode5.sortByTree(strings);

        assertArrayEquals(new String[]{"abc", "bar", "foo", "xyz"}, strings);
    }

}