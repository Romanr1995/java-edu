package com.metanit;

public class Arrays2d {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];

        int[][] arr2 = {
                {1,2,3},
                {4,5,6,7},
                {3,3,3}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j * j;
            }
        }

        printPretty(arr);
    }

    /*
    |1 2 3|     | 6  |
    |4 8 9| =>  | 21 |
     */
    public static long[] sumArr(int[][] arr){
        long[] sum = new long[arr.length];

        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                sum[i] += arr[i][j];
//            }
            sum[i] = ArraysStats.sumOfArray(arr[i]);
        }
        return sum;
    }

    public static void printPretty(int[][] arr) {
        final int indent = 4;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String val = String.valueOf(arr[i][j]);
                System.out.print(lpad(val, ' ', indent) + "\t");
            }
            System.out.println();
        }
    }

    private static String lpad(String s, char c, int n) {
        if (s.length() < n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n - s.length(); i++) {
                sb.append(c);
            }
            sb.append(s);
            return sb.toString();
        }
        return s;
    }

    /*
             | 1 2 |
    (3,2) => | 4 3 |
             | 5 6 |
     */
    public static int[][] generateIotaSnake(int rows, int cols) {
        return null;
    }
}
