package com.metanit.zadaniya;

public class Decomposition {

    public static int decompositionOfNumber(int number) {
        int res = 1;

        Outer:for (int i = 1; i <= number/2; i++) {
            int summ = i;
            Inner:for(int k = i+1; k <= number/2 + 1;k++) {
                summ +=k;
                if (summ == number) {
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
