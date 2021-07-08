package com.metanit.zadaniya;

import java.util.*;


public class SortingTheTime {
    public static void main(String[] args) {

//        sortingTheTime(5, "10 20 30","7 30 00", "23 59 59","8 20 40","13 30 30");

        System.out.println(sortingTheTimeMap("10 20 30","7 30 00", "23 59 59","8 20 40","13 30 30"));

    }

    public static void sortingTheTime( String... time) {
        int[] seconds = new int[time.length];

        for (int i = 0; i < time.length; i++) {
            seconds[i] = parseHour(time[i]) * 3600 + parseMinute(time[i]) * 60 + parseSeconds(time[i]);
        }
        Arrays.sort(seconds);
        for (int k = 0; k < seconds.length; k++) {
            String res = convertsSecondsToHours(seconds[k]) + convertsSecondsToMinute(seconds[k])
                    + convertsSecondsToSecondsString(seconds[k]);
            System.out.println(res);
        }

    }

    public static List<String> sortingTheTimeMap(String... time) {
        Map<Integer,String> m = new TreeMap<>();
//            for (int k = 0; k < time.length; k++) {
//                m.put((parseHour(time[k]) * 3600 + parseMinute(time[k]) * 60 + parseSeconds(time[k])),time[k]);
//            }
        for(String s: time) {
            m.put((parseHour(s) * 3600 + parseMinute(s) * 60 + parseSeconds(s)),s);
        }

        List<String> result = new ArrayList<>(m.size());

        for (Map.Entry<Integer, String> e : m.entrySet()) {
            result.add(e.getValue());
        }
        return result;
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


