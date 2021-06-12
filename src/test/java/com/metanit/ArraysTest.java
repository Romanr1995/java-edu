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
    public void testRotate() {
        int[] testArr = {2,4,7,8};
        int steps = 1;
        Arrays.rotate(testArr,steps);

        assertArrayEquals(new int[]{4,7,8,2}, testArr);
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
        assert testArr[0] == 4 && testArr[1] == 7 && testArr[2] == 8 && testArr[3] == 2;
    }
}
