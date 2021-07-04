package com.metanit.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeArraysTest {

    @Test
    public void test3plus3() {
        int[] result = MergeArrays.mergeArraysV2(new int[]{1, 2, 3}, new int[]{1, 2, 3});

        assertArrayEquals(new int[]{1,1,2,2,3,3}, result);;
    }
}