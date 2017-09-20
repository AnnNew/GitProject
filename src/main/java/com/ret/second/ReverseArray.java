package com.ret.second;

import java.util.Arrays;

public class ReverseArray {
    public int[] reverseTheArray(){
        int array[] = {1,3,5,7,8,9,4};
        for(int i=0;i<array.length/2;i++){
            int temp;
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;

    }

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        System.out.println(Arrays.toString(reverseArray.reverseTheArray()));

    }
}
