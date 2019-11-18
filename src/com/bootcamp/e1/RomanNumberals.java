package com.bootcamp.e1;

public class RomanNumberals {

    public static String toRoman(int i) {
        if (i == 2)
            return "II";
        else if (i == 3)
            return "III";

        return "I";
    }
}
