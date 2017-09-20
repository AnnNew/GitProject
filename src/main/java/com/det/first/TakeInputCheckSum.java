package com.det.first;

public class TakeInputCheckSum {
    public static boolean takeInputAndCheckItsSum(int numbers[]) {
        int sum = numbers[0] + numbers[1];
        for (int index = 2; index <= numbers.length - 1; index++) {
            if (sum == numbers[index]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        takeInputAndCheckItsSum(new int[]{1, 2, 4, 5, 4});
    }
}
//Take 5 number input from user , store it in array. add first and second element,
//        check sum is present in remaining three or not
//