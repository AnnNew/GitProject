package com.ret.second;

public class SumOfDigitsOfNumber {

    public static int sumOfDigits(Integer number) {
        int sum = 0;
        String representativeNumber = String.valueOf(number);

        for (Character digit : representativeNumber.toCharArray()) {
            sum += Integer.parseInt(digit.toString());
        }
        return sum;

        /*
        int number;
        int remainder, sum=0;
        while(number>0){
        remainder = number%10;
        sum = sum + remainder;
        number = number/10;
        }
         */
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(11111111));
    }
}
