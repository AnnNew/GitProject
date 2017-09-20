package com.ret.second;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 79876008;
        int remainder;
        int reversenum = 0;
        if (num < 10) {
            System.out.println(num);
           return;
        }
        while (num != 0) {
            remainder = num % 10;
            reversenum = reversenum * 10 + remainder;
            num = num / 10;
        }
        System.out.println(reversenum);
    }
}
