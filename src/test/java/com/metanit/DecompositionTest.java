package com.metanit;

import com.metanit.zadaniya.Decomposition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecompositionTest {

    @Test
    void number25() {
        assertEquals(5,Decomposition.decompositionOfNumber(25));
    }

    @Test
    void number5() {
        assertEquals(2,Decomposition.decompositionOfNumber(5));
    }

    @Test
    void number2() {
        assertEquals(1,Decomposition.decompositionOfNumber(2));
    }
}
