package com.bootcamp.e1;

public class RomanNumerals {

    public static String toRoman(int input) {
        StringBuilder strbldr = new StringBuilder();

        int remainder = input;

        if (remainder == 4)
            return "IV";

        if (remainder >= 5) {
            strbldr.append("V");
            remainder -= 5;
        }

        for (int i = 1; i <= remainder; i++) {
            strbldr.append("I");
        }

        return strbldr.toString();
    }
}
