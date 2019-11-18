package com.bootcamp.e1;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberalsTest {

    @Test
    public void testOne() {
        Assert.assertEquals("for 1", "I", RomanNumberals.toRoman(1));
    }

    @Test
    public void testTwo() {
        Assert.assertEquals("for 2", "II", RomanNumberals.toRoman(2));
    }

    @Test
    public void testThree() {
        Assert.assertEquals("for 3", "III", RomanNumberals.toRoman(3));
    }
}
