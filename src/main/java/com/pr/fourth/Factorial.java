package com.pr.fourth;

public class Factorial {

    public void findFactorial(int number) {
        int multiple = 1;

        for (int index = 1; index <= number; index++) {
            multiple = multiple * index;
        }
        System.out.println(multiple);
    }

    // By Recursion
//    public int findFactorial(int number) {
//        if (number == 0 || number == 1) {
//            return 1;
//        }
//        return number * findFactorial(number - 1);
//    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.findFactorial(3);
    }


}


