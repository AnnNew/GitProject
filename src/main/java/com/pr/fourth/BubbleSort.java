package com.pr.fourth;

import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSortList(int input[]) {

        for(int index=0;index <input.length - 1;index++){
            for(int index2= 0; index2 < input.length -1 - index;index2++){
                if(input[index2] > input[index2 + 1])
                {
                    int temporary;
                    temporary = input[index2];
                    input[index2] = input[index2 + 1];
                    input[index2 + 1] = temporary;
                }
            }
        }
        return input;
    }
    public static void main(String[] args){
        BubbleSort obj = new BubbleSort();
        System.out.println(Arrays.toString(obj.bubbleSortList(new int[]{5,4,8,9,2})));
    }
}
