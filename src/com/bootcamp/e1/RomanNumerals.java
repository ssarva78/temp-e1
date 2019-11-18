package com.bootcamp.e1;

public class RomanNumerals {

    public static String toRoman(int input) {
        StringBuilder strbldr = new StringBuilder();

        int remainder = input;

        if (remainder == 4)
            return "IV";

        if (remainder == 9)
            return "IX";

        remainder = prefixRomanLiteral(remainder, strbldr, 10, "X");
        remainder = prefixRomanLiteral(remainder, strbldr, 5, "V");

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
