package com.ret.second;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){
        int sum = 0;
        for(int index=1;index<number;index++){
            if(number%index == 0){
                sum = sum + index;
            }
            if(number==sum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(46));
    }
}
