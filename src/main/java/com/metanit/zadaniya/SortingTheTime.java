package com.metanit.zadaniya;

import java.util.Arrays;

public class SortingTheTime {
    public static void main(String[] args) {

        sortingTheTime(5, "10 20 30","7 30 00", "23 59 59","8 20 40","13 30 30");

    }

    public static void sortingTheTime(int N, String... time) {
        int[] sekonds = new int[N];

        for (int i = 0; i < N; i++) {
            sekonds[i] = parseHour(time[i]) * 3600 + parseMinute(time[i]) * 60 + parseSeconds(time[i]);
        }
        Arrays.sort(sekonds);
        for (int k = 0; k < sekonds.length; k++) {
            System.out.println(convertsSecondsToHours(sekonds[k]) + convertsSecondsToMinute(sekonds[k])
                    + convertsSecondsToSecondsString(sekonds[k]));
        }

    }

    public static int parseHour(String s) {
        String s1 = "";

        if (s.length() == 8) {
            s1 = s.substring(0, 2);
        } else {
            s1 = s.substring(0, 1);
        }

        return Integer.parseInt(s1);
    }

    public static int parseMinute(String s) {
        String s1 = "";

        if (s.length() == 8) {
            s1 = s.substring(3, 5);
        } else {
            s1 = s.substring(2, 4);
        }

        return Integer.parseInt(s1);
    }

    public static int parseSeconds(String s) {
        String s1 = "";

        if (s.length() == 8) {
            s1 = s.substring(6, 8);
        } else {
            s1 = s.substring(5, 7);
        }

        return Integer.parseInt(s1);
    }

    public static String convertsSecondsToHours(int sekonds) {
        return sekonds / 3600 + " ";
    }

    public static String convertsSecondsToMinute(int sekonds) {

       int minuteToSecods = (sekonds%3600)/60;

        return minuteToSecods + " ";
    }

    public static String convertsSecondsToSecondsString(int sekonds) {

        int seconds1 = sekonds - sekonds/3600*3600 - (sekonds % 3600)/60*60;

        return seconds1 + "";
    }
}


