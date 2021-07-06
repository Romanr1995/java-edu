package com.metanit.zadaniya;

public class ConverterInArabic2 {

    public static void main(String[] args) {

        System.out.println(converterToArabicNumbersTo1000(475));
    }

    public static String converterToArabicNumbersTo1000(int numbers) {
        String[] numbersToX = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] numbersToC = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] numbersToM = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String res = "";

        if (numbers < 10) {
            res += numbersToX[numbers - 1];
        } else if (numbers >= 10 && numbers < 100) {
            res += numbersToC[numbers / 10 - 1] + numbersToX[numbers % 10 - 1];
        } else if (numbers >= 100 && numbers < 1000) {
            res += numbersToM[numbers / 100 - 1] + numbersToC[(numbers % 100) / 10 - 1]
                    + numbersToX[(numbers % 100) % 10 - 1];
        } else if (numbers == 1000) {
            res += "M";
        } else {
            res += "Число должно быть от 1 до 1000";
        }
        return res;
    }
}
