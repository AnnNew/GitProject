package com.ret.second;

import java.util.Arrays;

public class BubbleSort {
    public int[] implementBubbleSort(int array[]) {
        int temp = 0;
        int index, index2;
        for (index = 0; index < array.length - 1; index++) {
            for (index2 = 0; index2 < array.length - 1 - index; index2++) {
                if (array[index2] > array[index2 + 1]) {
                    temp = array[index2];
                    array[index2] = array[index2 + 1];
                    array[index2 + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.implementBubbleSort(new int[]{3, 5, 8, 9, 2, 4, 1})));

    }
}
