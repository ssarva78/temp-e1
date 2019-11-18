package com.bootcamp.e1;

public class RomanNumerals {

    public static String toRoman(int input) {
        final int[] numbers = {400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] literals = {"CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder strbldr = new StringBuilder();

        int remainder = input;

        for (int i = 0; i < numbers.length; i ++) {
            while (remainder >= numbers[i])
                remainder = prefixRomanLiteral(remainder, strbldr, numbers[i], literals[i]);
        }

        return strbldr.toString();
    }

    private static int prefixRomanLiteral(int remainder, StringBuilder bldr, int input, String literal) {
        if (remainder >= input) {
            bldr.append(literal);
            return remainder - input;
        }

        return remainder;
    }
}
