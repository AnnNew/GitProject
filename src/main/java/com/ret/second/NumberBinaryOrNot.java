package com.ret.second;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberBinaryOrNot {
    public static boolean isBinaryOrNot(int number) {
        int remainder;

        while (number > 0) {
            remainder = number % 10;
            if (remainder != 0 && remainder != 1) {
                return false;
            }
            number = number / 10;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isBinaryOrNot(101110));
    }

    @Test
    public void test()
    {
        Assert.assertTrue(NumberBinaryOrNot.isBinaryOrNot(101010101));
        Assert.assertFalse(NumberBinaryOrNot.isBinaryOrNot(12));
        Assert.assertTrue(NumberBinaryOrNot.isBinaryOrNot(0));
    }
}
