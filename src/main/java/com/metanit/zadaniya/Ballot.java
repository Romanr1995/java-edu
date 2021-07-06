package com.metanit.zadaniya;

import java.util.Arrays;

public class Ballot {

    public static void main(String[] args) {
        System.out.println(ballot(4,2,2,2,2));
    }

    public static int ballot(int group,int...electorate) {
        int minElectorate = 0;
        int[] minElectorate1 = new int[group/2 + 1];

        Arrays.sort(electorate);
        for (int i = 0; i < minElectorate1.length; i++) {
            minElectorate1[i] = electorate[i];
            minElectorate+=(minElectorate1[i]/2 + 1);
        }
        return minElectorate;
    }
}
