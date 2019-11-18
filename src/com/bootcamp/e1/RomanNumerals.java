package com.bootcamp.e1;

public class RomanNumerals {

    public static String toRoman(int input) {
        final int[] numbers = {10, 9, 5, 4, 1};
        final String[] literals = {"X", "IX", "V", "IV", "I"};
        StringBuilder strbldr = new StringBuilder();

        int remainder = input;

        while (remainder >= 10)
            remainder = prefixRomanLiteral(remainder, strbldr, 10, "X");

        remainder = prefixRomanLiteral(remainder, strbldr, 9, "IX");
        remainder = prefixRomanLiteral(remainder, strbldr, 5, "V");
        remainder = prefixRomanLiteral(remainder, strbldr, 4, "IV");

        for (int i = 1; i <= remainder; i++) {
            strbldr.append("I");
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
