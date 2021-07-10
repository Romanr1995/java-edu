package com.metanit.java8;

import org.junit.jupiter.api.Test;

import static com.metanit.java8.DemoCode2.sumOfDigits;
import static org.junit.jupiter.api.Assertions.*;

class DemoCode2Test {

    @Test
    void testSumOfDigits5445() {
        assertEquals(18, sumOfDigits(5445));
    }

    @Test
    void testSumOfDigits0() {
        assertEquals(0, sumOfDigits(0));
    }

    @Test
    void testSumOfDigits1() {
        assertEquals(1, sumOfDigits(1));
    }

}