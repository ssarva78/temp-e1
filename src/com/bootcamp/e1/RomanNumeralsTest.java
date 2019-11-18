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

    @Test
    public void testFourteen() {
        Assert.assertEquals("for 14", "XIV", RomanNumerals.toRoman(14));
    }

    @Test
    public void testFifteenToNineteen() {
        Assert.assertEquals("for 15", "XV", RomanNumerals.toRoman(15));
        Assert.assertEquals("for 16", "XVI", RomanNumerals.toRoman(16));
        Assert.assertEquals("for 17", "XVII", RomanNumerals.toRoman(17));
        Assert.assertEquals("for 18", "XVIII", RomanNumerals.toRoman(18));
        Assert.assertEquals("for 19", "XIX", RomanNumerals.toRoman(19));
    }
    @Test
    public void testTwentyAndBelowFourty() {
        Assert.assertEquals("for 20", "XX", RomanNumerals.toRoman(20));
        Assert.assertEquals("for 21", "XXI", RomanNumerals.toRoman(21));
        Assert.assertEquals("for 24", "XXIV", RomanNumerals.toRoman(24));
        Assert.assertEquals("for 25", "XXV", RomanNumerals.toRoman(25));
        Assert.assertEquals("for 26", "XXVI", RomanNumerals.toRoman(26));
        Assert.assertEquals("for 29", "XXIX", RomanNumerals.toRoman(29));
        Assert.assertEquals("for 30", "XXX", RomanNumerals.toRoman(30));
        Assert.assertEquals("for 39", "XXXIX", RomanNumerals.toRoman(39));
    }

}
