package com.bootcamp.e1;

public class RomanNumberals {

    public static String toRoman(int input) {
        StringBuilder strbldr = new StringBuilder();

        for (int i = 1; i <= input; i++) {
            strbldr.append("I");
        }

        return strbldr.toString();
    }
}
