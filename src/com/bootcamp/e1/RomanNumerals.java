package com.bootcamp.e1;

public class RomanNumerals {

    public static String toRoman(int input) {
        final int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] literals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder strbldr = new StringBuilder();

        int remainder = input;

        for (int i = 0; i < numbers.length; i ++) {
            if (remainder < numbers[i])
                continue;

            int quotient = remainder / numbers[i];
            strbldr.append(new String(new char[quotient]).replace("\0", literals[i]));
            remainder %= numbers[i];
        }

        return strbldr.toString();
    }

}
