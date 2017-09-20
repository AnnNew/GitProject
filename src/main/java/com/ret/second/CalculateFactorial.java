package com.ret.second;

public class CalculateFactorial {
    public int calculateFactorial(int number) {
        int multiple = 1;
        for (int index = 1; index <= number; index++) {
            multiple = multiple * index;
        }
        return multiple;
    }

    public static void main(String[] args) {
        CalculateFactorial calculateFactorial = new CalculateFactorial();
        System.out.println(calculateFactorial.calculateFactorial(5));
    }
}
