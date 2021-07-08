package com.metanit.zadaniya;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ElectronicsShop {

    public static void main(String[] args) {
        int b = 60;
        int[] n = {40,50,60};
        int[] m = {5,8,12};

        System.out.println(choosingElectronics(b,n,m));
    }

    public static int choosingElectronics(int b,int[] keyboards,int[] drives) {
        List<Integer> summa = new ArrayList<>();

        for (int i = 0; i < keyboards.length; i++) {
            for (int k = 0; k < drives.length; k++) {
                if (keyboards[i] + drives[k] <= b) {
                    summa.add(keyboards[i] + drives[k]);
                } else {
                    summa.add(-1);
                }
            }
        }
        summa.sort(Comparator.naturalOrder());
        return summa.get(summa.size() - 1);
    }
}
