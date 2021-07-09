package com.metanit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static com.metanit.zadaniya.Roads.*;

public class RoadsTest {

    @Test
    void матрица5На5() {
        int[] a = {0,1,0,0,0};
        int[] b = {1,0,1,1,0};
        int[] c = {0,1,0,0,0};
        int[] d = {0,1,0,0,0};
        int[] e = {0,0,0,0,0};

        assertEquals(3,roads(a,b,c,d,e));
    }

    @Test
    void матрица5На5Нулевая() {
        int[] a = {0,0,0,0,0};
        int[] b = {0,0,0,0,0};
        int[] c = {0,0,0,0,0};
        int[] d = {0,0,0,0,0};
        int[] e = {0,0,0,0,0};

        assertEquals(0,roads(a,b,c,d,e));
    }

    @Test
    void матрица4На4С6Ребрами() {
        int[] a = {1,1,1,1};
        int[] b = {1,1,1,1};
        int[] c = {1,1,1,1};
        int[] d = {1,1,1,1};


        assertEquals(6,roads(a,b,c,d));
    }
}
