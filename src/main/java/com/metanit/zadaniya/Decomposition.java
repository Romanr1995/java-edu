package com.metanit.zadaniya;

public class Decomposition {

    public static int decompositionOfNumber(int number) {
        int res = 1;

        Outer:for (int i = 1; i <= number/2; i++) {
            int sum = i;
            for(int k = i+1; k <= number/2 + 1;k++) {
                sum +=k;
                if (sum == number) {
                    res += k - i;
                    break Outer;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(decompositionOfNumber(25));
    }
}
