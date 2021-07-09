package com.metanit.zadaniya;

public class Roads {

    public static int roads(int[]...matrix) {
        int roads = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int k = 0; k < i; k++) {
                if (matrix[i][k] == 1) {
                    roads++;
                }
            }
        }
        return roads;
    }
}
