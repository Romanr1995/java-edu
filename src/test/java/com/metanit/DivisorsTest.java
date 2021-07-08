package com.metanit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.metanit.zadaniya.Divisors.*;

public class DivisorsTest {

    @Test
    void число4() {

        assertEquals(4,numberOfDivisors(3));
    }

    @Test
    void число6() {

        assertEquals(6,numberOfDivisors(4));
    }

    @Test
    void число60() {

        assertEquals(60,numberOfDivisors(12));
    }

    @Test
    void число5040() {

        assertEquals(5040,numberOfDivisors(60));
    }

    @Test
    void большоеЧисло() {

        assertEquals(0,numberOfDivisors(4911));
    }
}
