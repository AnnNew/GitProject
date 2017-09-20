package com.ret.second;

public class ArmStrongOrNot {
    public static void main(String[] args) {
        int number = 153;
        int multiple = 0;
        int temp = number;

        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            multiple = multiple + (int) Math.pow(remainder, 3);
        }

        if (temp != multiple) {
            System.out.println("Not ArmsStrong");
        } else {
            System.out.println("ArmsStrong");
        }
    }
}
