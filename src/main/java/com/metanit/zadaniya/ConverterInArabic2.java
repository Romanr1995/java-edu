package com.metanit.zadaniya;

public class ConverterInArabic2 {

    private static final String[] numbersToX = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] numbersToC = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] numbersToM = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] numbersToMM = {"M", "MM", "MMM"};

    public static void main(String[] args) {

        System.out.println(convertFromArabicToRoman(475));
    }

//    public static String converterToArabicNumbersTo1000(int num) {
//        String res = "";
//
//        if (num < 10) {
//            res += numbersToX[num - 1];
//        } else if (num < 100) {
//            res += numbersToC[num / 10 - 1] + numbersToX[num % 10 - 1];
//        } else if (num < 1000) {
//            res += numbersToM[num / 100 - 1] + numbersToC[(num % 100) / 10 - 1]
//                    + numbersToX[(num % 100) % 10 - 1];
//        } else if (num == 1000) {
//            res += "M";
//        } else {
//            res += "Число должно быть от 1 до 1000";
//        }
//        return res;
//    }

    public static String convertFromArabicToRoman(int num) {
        if (num > 3999) {
            throw new RuntimeException("cannot convert numbers more than 3999!");
        }

        StringBuilder sb = new StringBuilder();
        String[][] romans = {numbersToX, numbersToC, numbersToM, numbersToMM};

        int k = 0;
        while (num > 0) {
            int digit = num % 10;//0....9
            num /= 10;

            if (digit > 0) {
                sb.insert(0, romans[k][digit - 1]);
            }
            k++;
        }

        return sb.toString();
    }
}
