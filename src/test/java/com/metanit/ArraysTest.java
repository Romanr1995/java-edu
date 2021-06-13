package com.metanit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysTest {
    @Test
    public void testFindMinMaxElement() {
        int[] testArr = {4,8,6,0};

        Arrays.MinMax res = Arrays.findMinMaxElement(testArr);

        assertEquals(0, res.min);
        assertEquals(8, res.max);
    }

    @Test
    public void testFindMinMaxElementEmptyArray() {
        int[] testArr = {};

        Arrays.MinMax res = Arrays.findMinMaxElement(testArr);

        assertNull(res);
    }

    @Test
    public void testFindMinMaxElementNullArray() {
        int[] testArr = null;

        Arrays.MinMax res = Arrays.findMinMaxElement(testArr);

        assert res == null;
    }

    @Test
    public void testRotateEmptyArray() {
        int[] testArr = {};
        int steps = 1;
        Arrays.rotate(testArr,steps);
    }

    @Test
    public void testSwapFirstAndLast() {
        int[] testArr = {5,4,7,9,1,0};

        Arrays.swapFirstAndLast(testArr);

        assertArrayEquals(new int[]{0,4,7,9,1,5}, testArr);
    }
    @Test
    public void testRotate() {
        int[] testArr = {2,4,7,8};
        int steps = 1;
        Arrays.rotate(testArr,steps);

        assertArrayEquals(new int[]{8,2,4,7}, testArr);
    }

    @Test
    public void testRotateBillionSteps() {
        int[] testArr = {2,4,7,8};
        int steps = 1_000_000_000;

        long start = System.currentTimeMillis();
        Arrays.rotate(testArr,steps);

        long time = System.currentTimeMillis() - start;

        System.out.println("time = " + time);
        assert time < 200;
        assertArrayEquals(new int[]{2,4,7,8}, testArr);
    }

    @Test
    public void testRotateNullArray() {
        int[] testArr = null;
        int steps = 1;
        Arrays.rotate(testArr,steps);
    }

    @Test
    public void testRotateZeroSteps() {
        int[] testArr = {2,4,7,8};
        int steps = 0;
        Arrays.rotate(testArr,steps);
        assert testArr[0] == 2 && testArr[1] == 4 && testArr[2] == 7 && testArr[3] == 8;
    }

    @Test
    public void testRotateTwoSteps() {
        int[] testArr = {2,4,7,8};
        int steps = 2;
        Arrays.rotate(testArr,steps);
        assert testArr[0] == 7 && testArr[1] == 8 && testArr[2] == 2 && testArr[3] == 4;
    }

    @Test
    public void testRotateNegativeSteps() {
        int[] testArr = {2,4,7,8};
        int steps = -1;
        Arrays.rotate(testArr,steps);
        assertArrayEquals(new  int[]{4,7,8,2}, testArr);
    }
}
