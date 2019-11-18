package com.bootcamp.e1;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

    @Test
    public void testOne() {
        Assert.assertEquals("for 1", "I", RomanNumerals.toRoman(1));
    }

    @Test
    public void testTwo() {
        Assert.assertEquals("for 2", "II", RomanNumerals.toRoman(2));
    }

    @Test
    public void testThree() {
        Assert.assertEquals("for 3", "III", RomanNumerals.toRoman(3));
    }

    @Test
    public void testFour() {
        Assert.assertEquals("for 4", "IV", RomanNumerals.toRoman(4));
    }

    @Test
    public void testFive() {
        Assert.assertEquals("for 5", "V", RomanNumerals.toRoman(5));
    }

    @Test
    public void testSixSevenEight() {
        Assert.assertEquals("for 6", "VI", RomanNumerals.toRoman(6));
    }
}
