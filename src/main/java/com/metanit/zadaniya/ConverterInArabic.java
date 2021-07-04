package com.metanit.zadaniya;

public class ConverterInArabic {

    public static void main(String[] args) {

        System.out.println(converterToArabicNumbersTo1000(475));
    }

    public static String converterToArabicNumbersTo1000(int numbers) {
        String res = "";

        if (numbers < 500) {
            res+= converterToArabicNumbersTo499(numbers);

        } else if (numbers >= 500 && numbers < 900) {
                res+="D" + converterToArabicNumbersTo499(numbers - 500) ;

        } else if (numbers >=900 && numbers < 1000) {
            res+="CM" + converterToArabicNumbersTo99(numbers - 900);
        } else if (numbers == 1000) {
            res+="M";
        } else {
            res+="Число должно быть от 1 до 1000";
        }
        return res;
    }

    public static String converterToArabicNumbersTo499(int numbers) {
        String res = "";
        int k;

        if (numbers < 100) {
            res+= converterToArabicNumbersTo99(numbers);

        } else if (numbers >= 100 && numbers < 400) {
            for (k = 0; k < numbers/100; k++) {
                res+="C" ;
            }
            res+=converterToArabicNumbersTo99(numbers - k*100) ;
        } else if (numbers >=400 && numbers < 500) {
            res+="CD" + converterToArabicNumbersTo99(numbers - 400);
        }
        return res;
        }



    public static String converterToArabicNumbersTo99(int numbers) {
        String res = "";

        if (numbers < 50) {
            res+= converterToArabicNumbersTo49(numbers);

            } else if (numbers >= 50 && numbers < 90) {
            res+="L" + converterToArabicNumbersTo49(numbers - 50);
        } else if (numbers >=90 && numbers < 100) {
            res+="XC" + converterToArabicNumbersTo49(numbers - 90);
        }
        return res;
    }



    public static String converterToArabicNumbersTo49(int numbers) {
        String[] numbersRoman1 = {"I", "II", "III", "IV", "V", "VI", "VII", "VII", "IX", "X"};
        String res = "";
        int k;

        for (int i = 1; i < 50; i++) {
            if (numbers == i && numbers <= 10) {
                res+= numbersRoman1[i - 1];
            } else if (numbers == i && numbers > 10 && numbers < 40) {
                for (k = 0; k < numbers / 10; k++) {
                    res+= "X";
                }
                res += numbersRoman1[i - 1 - k * 10];
            } else if (numbers == i && numbers >= 40 && numbers < 50) {

                res+= "XL" + numbersRoman1[i % 40 - 1];
            }
        }
        return res;
    }
}
