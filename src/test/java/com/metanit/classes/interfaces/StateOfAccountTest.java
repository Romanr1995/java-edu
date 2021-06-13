package com.metanit.classes.interfaces;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StateOfAccountTest {

    @Test
    public void testCompareTwoDifferentStatuses() {
        StateOfAccount a1 = new StateOfAccount(1000, "OPENED");
        StateOfAccount a2 = new StateOfAccount(10000, "CLOSED");

        //a1 < a2
        assert a1.compareTo(a2) < 0;
    }

    @Test
    public void testSort() {
        StateOfAccount[] arr = {
                new StateOfAccount(100, "OPENED"),
                new StateOfAccount(0, "CLOSED"),
                new StateOfAccount(100, "OPENED"),
                new StateOfAccount(10000, "OPENED"),
                new StateOfAccount(11, "OPENED"),
                new StateOfAccount(-10, "OPENED"),
                new StateOfAccount(9999999, "OPENED"),
                new StateOfAccount(12, "CLOSED"),
                new StateOfAccount(0, "OPENED"),
                new StateOfAccount(100, "CLOSED"),
        };

        Arrays.sort(arr);

        for (StateOfAccount stateOfAccount : arr) {
            System.out.println(stateOfAccount);
        }
    }

}