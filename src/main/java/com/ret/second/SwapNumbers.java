package com.ret.second;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int temp;

        temp = a;
        a = b;
        b = temp;

        // Without using temp variable
        a = a + b;
        b = a - b;
        a = a - b;

    }
}
