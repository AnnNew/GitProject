package com.pr.fourth;

public class ArmsStrong {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        a = a+b;
        b = a-b;
        a = a-b;

        char[] digits = String.valueOf(153).toCharArray();

        for(char digit : digits) {
            System.out.println(digit);
        };

    }
}



