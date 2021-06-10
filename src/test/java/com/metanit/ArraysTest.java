package com.metanit;

import org.junit.jupiter.api.Test;

public class ArraysTest {
    @Test
    public void testFindMinMaxElement() {
        int[] testArr = {4,8,6,0};

        Arrays.MinMax res = Arrays.findMinMaxElement(testArr);

        assert res.min == 0;
        assert res.max == 8;
    }

    @Test
    public void testFindMinMaxElementEmptyArray() {
        int[] testArr = {};

        Arrays.MinMax res = Arrays.findMinMaxElement(testArr);

        assert res == null;
    }

    @Test
    public void testFindMinMaxElementNullArray() {
        int[] testArr = null;

        Arrays.MinMax res = Arrays.findMinMaxElement(testArr);

        assert res == null;
    }
}
