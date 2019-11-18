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
    public void testFiveToEight() {
        Assert.assertEquals("for 5", "V", RomanNumerals.toRoman(5));
        Assert.assertEquals("for 6", "VI", RomanNumerals.toRoman(6));
        Assert.assertEquals("for 7", "VII", RomanNumerals.toRoman(7));
        Assert.assertEquals("for 8", "VIII", RomanNumerals.toRoman(8));
    }

    @Test
    public void testNine() {
        Assert.assertEquals("for 9", "IX", RomanNumerals.toRoman(9));
    }

    @Test
    public void testTenToThirteen() {
        Assert.assertEquals("for 10", "X", RomanNumerals.toRoman(10));
        Assert.assertEquals("for 11", "XI", RomanNumerals.toRoman(11));
        Assert.assertEquals("for 12", "XII", RomanNumerals.toRoman(12));
        Assert.assertEquals("for 13", "XIII", RomanNumerals.toRoman(13));
    }
}
