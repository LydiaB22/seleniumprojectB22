package com.cybertek.tests.selfpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGPractice {
    @Test
    public void test() {
   //     Assert.assertEquals("apple", "orange");
        String[] fruits = {"apple", "orange"};
        String[] fruits2 = {"pear", "orange"};
//Assert.assertEquals(fruits,fruits2);
        Assert.assertTrue(5 > 3);
        Assert.assertFalse(10 - 4 < 40);


    }
}