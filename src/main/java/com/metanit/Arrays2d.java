package com.metanit;

public class Arrays2d {
    public static void main(String[] args) {
        int[][] sample1 = {
                {1, 2, 3},
                {2, 4, 6},
                {8, 8, 1}
        };
        int[][] result1 = generateAdjustmentSumArray(sample1);
        printPretty(result1);
    }

    /*
    |1 2 3|     | 6  |
    |4 8 9| =>  | 21 |
     */
    public static long[] sumArr(int[][] arr) {
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

             генерировать 2мерныйй массив который заполнен числами
             от 1 до N в порядке змейки (если провести линию в порядке возрастания то получится змея)
     */

    /**
     * @param rows кол-во строк.
     * @param cols кол-во колонок.
     */
    public static int[][] generateIotaSnake(int rows, int cols) {
        int[][] num1 = new int[rows][cols];
        int cnt = 1;
        for (int i = 0; i < num1.length; ++i) {
            if (i % 2 == 0) {
                for (int j = 0; j < num1[i].length; j++) {
                    num1[i][j] = cnt;
                    cnt++;
                }
            } else {
                for (int k = num1[i].length - 1; k >= 0; k--) {
                    num1[i][k] = cnt;
                    cnt++;
                }
            }
        }
        return num1;
    }

    public static int[][] generateIotaSnakeV2(int rows, int cols) {
        int[][] num1 = new int[rows][cols];
        int cnt = 1;
        for (int i = 0; i < num1.length; ++i) {
            int j;
            int delta;

            if (i % 2 == 0) {
                j = 0;
                delta = 1;
            } else {
                j = num1[i].length - 1;
                delta = -1;
            }

            while (j >= 0 && j < num1[i].length) {
                num1[i][j] = cnt++;
                j += delta;
            }
        }
        return num1;
    }

    public static int[][] generateAdjustmentSumArray(int[][] a) {
        int[][] r = new int[a.length][];

        for (int i = 0; i < a.length; ++i) {

            r[i] = new int[a[i].length];
            for (int j = 0; j < a[i].length; ++j) {
                if (i != 0 && i != (a.length - 1) && j != 0 && j != (a[i].length - 1)) {//center
                    r[i][j] = a[i - 1][j] + a[i + 1][j] + a[i][j - 1] + a[i][j + 1];
                } else if (i == 0 && j == 0) {// top-left corner
                    r[i][j] = a[i + 1][j] + a[i][j + 1];
                } else if (i == 0 && j == (a[i].length - 1)) { //top-right corner
                    r[i][j] = a[i][j - 1] + a[i + 1][j];
                } else if (i == (a.length - 1) && j == 0) {// bottom-left corner
                    r[i][j] = a[i - 1][j] + a[i][j + 1];
                } else if (i == (a.length - 1) && j == (a[i].length - 1)) {// bottom-right corner
                    r[i][j] = a[i][j - 1] + a[i - 1][j];
                } else if (i == 0) { // top side
                    r[i][j] = a[i][j - 1] + a[i][j + 1] + a[i + 1][j];
                } else if (j == 0) { // left side
                    r[i][j] = a[i - 1][j] + a[i][j + 1] + a[i + 1][j];
                } else if (i == (a.length - 1)) { //bottom side
                    r[i][j] = a[i][j - 1] + a[i - 1][j] + a[i][j + 1];
                } else if (j == (a[i].length - 1)) { //right side
                    r[i][j] = a[i - 1][j] + a[i][j - 1] + a[i + 1][j];
                }
            }
        }
        return r;//B
    }
}

