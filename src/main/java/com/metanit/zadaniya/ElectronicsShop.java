package com.metanit.zadaniya;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ElectronicsShop {

    public static void main(String[] args) {
        int b = 60;
        int[] n = {40,50,60};
        int[] m = {5,8,12};

        System.out.println(shoosingElectronics(b,n,m));
    }

    public static int shoosingElectronics(int b,int[] n,int[] m) {
        List<Integer> summa = new ArrayList<>();

        for (int i = 0; i < n.length; i++) {
            for (int k = 0; k < m.length; k++) {
                if (n[i] + m[k] <= b) {
                    summa.add(n[i] + m[k]);
                } else {
                    summa.add(-1);
                }
            }
        }
        summa.sort(Comparator.naturalOrder());
        return summa.get(summa.size() - 1);
    }
}
