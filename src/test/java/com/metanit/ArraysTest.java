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

    @Test
    public void testRotateEmpyArray() {
        int[] testArr = {};
        int steps = 1;
        Arrays.rotate(testArr,steps);
        assert testArr[0] == 0 && testArr[1] == 0 && testArr[2] == 0 && testArr[3] ==0;
    }

    @Test
    public void testRotate() {
        int[] testArr = {2,4,7,8};
        int steps = 1;
        Arrays.rotate(testArr,steps);
        assert testArr[0] == 8 && testArr[1] == 2 && testArr[2] == 4 && testArr[3] == 7;
    }

    @Test
    public void testRotateNullArray() {
        int[] testArr = null;
        int steps = 1;
        Arrays.rotate(testArr,steps);
        assert testArr[0] == 0 && testArr[1] == 0 && testArr[2] == 0 && testArr[3] ==0;
    }

    @Test
    public void testRotateNullSteps() {
        int[] testArr = {2,4,7,8};
        int steps = 0;
        Arrays.rotate(testArr,steps);
        assert testArr[0] == 2 && testArr[1] == 4 && testArr[2] == 7 && testArr[3] == 8;
    }
}
