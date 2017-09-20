package com.det.first;
public class Prime {
    public static void main(String args[]) {
        for (int i = 2; i <= 10; i++)
        {
            System.out.println("I is :" + i);
            for (int j = 2; j <= i; j++) {
                System.out.println("J is:" + j);
                if (i == j) {
                    System.out.println(i + " \t J is : " + j);
                }
                if (i % j == 0) {
                    System.out.println("Breaking");
                    break;
                }
            }
        }
    }
}