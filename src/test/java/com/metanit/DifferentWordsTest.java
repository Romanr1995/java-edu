package com.metanit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
        import static com.metanit.zadaniya.DifferentWords.searchForWords;

public class DifferentWordsTest {

    @Test
    void abc() {

        assertEquals(6,searchForWords("abc"));

    }

    @Test
    void aaa() {

        assertEquals(3,searchForWords("aaa"));

    }

    @Test
    void a() {

        assertEquals(1,searchForWords("a"));

    }

    @Test
    void abcd() {

        assertEquals(10,searchForWords("abcd"));

    }
}
