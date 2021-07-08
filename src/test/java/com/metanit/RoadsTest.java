package com.metanit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.metanit.zadaniya.Roads.*;

public class RoadsTest {

    @Test
    void матрица5На5() {

        assertEquals(3,roads(01000,10110,01000,01000,00000));
    }
}
