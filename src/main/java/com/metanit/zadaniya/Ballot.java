package com.metanit.zadaniya;

import java.util.Arrays;

public class Ballot {

    public static void main(String[] args) {
        System.out.println(ballot(2,2,2,2));
    }

    public static int ballot(int...electorate) {
        int minElectorate = 0;

        Arrays.sort(electorate);
        for (int i = 0; i < electorate.length/2 + 1; i++) {
            minElectorate+=(electorate[i]/2 + 1);
        }
        return minElectorate;
    }
}
