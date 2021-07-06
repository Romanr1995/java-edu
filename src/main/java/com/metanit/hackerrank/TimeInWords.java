package com.metanit.hackerrank;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/the-time-in-words/problem
 */
class Result_ {

    private static final Map<Integer, String> digitToWords;

    static {
        digitToWords = new HashMap<>();
        digitToWords.put(1, "one");
        digitToWords.put(2, "two");
        digitToWords.put(3, "three");
        digitToWords.put(4, "four");
        digitToWords.put(5, "five");
        digitToWords.put(6, "six");
        digitToWords.put(7, "seven");
        digitToWords.put(8, "eight");
        digitToWords.put(9, "nine");
        digitToWords.put(10, "ten");
        digitToWords.put(11, "eleven");
        digitToWords.put(12, "twelve");
        digitToWords.put(13, "thirteen");
        digitToWords.put(14, "fourteen");
        digitToWords.put(15, "fifteen");
        digitToWords.put(16, "sixteen");
        digitToWords.put(17, "seventeen");
        digitToWords.put(18, "eighteen");
        digitToWords.put(19, "nineteen");
        digitToWords.put(20, "twenty");
    }

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER 1 <= h <= 12
     *  2. INTEGER 0 <= m <= 59
     */
    public static String timeInWords(int h, int m) {
        if (m == 0) {
            return digitToWords.get(h) + " o' clock";
        } else if (m <= 30) {
            return minutesToWords(m) + " past " + digitToWords.get(h);
        } else {
            int hPlus1 = h == 12 ? 1 : h + 1;
            return minutesToWords(m) + " to " + digitToWords.get(hPlus1);
        }
    }

    /** m > 0 */
    private static String minutesToWords(int m) {
        if (m > 20 && m < 30) {
            int ones = m - 20;

            return digitToWords.get(20) + " " + digitToWords.get(ones) + " minutes";
        }

        if (m == 1) {
            return digitToWords.get(m) + " minute";
        }

        if (m == 15) {
            return "quarter";
        }

        if (m == 30) {
            return "half";
        }

        if (m > 30) {
            return minutesToWords(60 - m);
        }

        return digitToWords.get(m) + " minutes";
    }

}

public class TimeInWords {
    public static void main_(String[] args) {
        System.out.println(Result_.timeInWords(12, 31));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result_.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
