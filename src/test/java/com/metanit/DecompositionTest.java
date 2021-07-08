package com.metanit;

import org.junit.jupiter.api.Test;

import static com.metanit.zadaniya.Decomposition.decompositionOfNumber;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecompositionTest {

    @Test
    void number25() {
        assertEquals(5, decompositionOfNumber(25));
    }

    @Test
    void number5() {
        assertEquals(2, decompositionOfNumber(5));
    }

    @Test
    void number2() {
        assertEquals(1, decompositionOfNumber(2));
    }

    @Test
    void number35() {
        assertEquals(7, decompositionOfNumber(35));
    }
}
