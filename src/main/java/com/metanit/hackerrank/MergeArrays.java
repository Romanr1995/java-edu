package com.metanit.hackerrank;

import java.util.Arrays;

public class MergeArrays {

    /**
     * a1, a2 - is sorted!
     * [a1] - n1
     * [a2] - n2
     */
    public static int[] mergeArrays(int[] a1, int[] a2) {//O((n1 + n2)log(n1+n2))
        int[] result = new int[a1.length + a2.length];//O(1)

        int k = 0;
        for (int i = 0; i < a1.length; i++) {//O(n1)
            result[k++] = a1[i];
        }

        for (int i = 0; i < a2.length; i++) {//O(n2)
            result[k++] = a2[i];
        }

        Arrays.sort(result);//O((n1 + n2)log(n1+n2))

        return result;
    }

    public static int[] mergeArraysV2(int[] a1, int[] a2) {//O(n1 + n2)
        int[] result = new int[a1.length + a2.length];

        int k1 = 0;
        int k2 = 0;
        for (int i = 0; i < result.length; i++) {//O(n1 + n2)
            int val;
            if (k1 >= a1.length) {
                val = a2[k2++];
            } else if (k2 >= a2.length){
                val = a1[k1++];
            } else if (a1[k1] < a2[k2]) {
                val = a1[k1++];
            } else {
                val = a2[k2++];
            }
            result[i] = val;
        }
        return result;
    }

    public static int[] mergeArrays23(int[] a,int[] b) {
        int[] result = new int[a.length + b.length];
        int c = 0;
        int d = 0;
        for (int i = 0; i < result.length; i++) {
            int val;
            if (c >= a.length) {
                val = b[d++];
            } else if (d >= b.length) {
                val = a[c++];
            } else if (a[c] < b[d]) {
                val = a[c++];
            } else {
                val = b[d++];
            }
            result[i] = val;
        }
        return result;
    }
}
