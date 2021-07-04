package com.metanit.classes.zadaniya;

import com.sun.source.doctree.SeeTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortingTheTime {
    public static void main(String[] args) {

        sortingTheTime(5, "10 20 30","7 30 00", "23 59 59","8 20 40","13 30 30");
    }

    public static void sortingTheTime(int N, String... time) {
        StringBuffer[] time1 = new StringBuffer[N];

        for (int i = 0; i < N; i++) {

            if (time1[i].length() == 7) {
                time1[i].append(time[i]);
                time1[i].insert(0,'0');
            } else {
                time1[i].append(time[i]);
            }
        }
        time1.toString();
        Arrays.sort(time1);
        for (int k = 0; k < time.length; k++) {
            System.out.println(time1[k]);
        }
    }

}

