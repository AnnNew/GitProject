package com.pr.fourth;

import java.util.Arrays;

public class InsertionSort {
    public int[] doInsertionSorting() {
        int[] input = {5, 6, 7, 3, 2, 4};
        int inner, outer, key, temp;
        for (outer = 1; outer < input.length; outer++) {
            key = input[outer];
            inner = outer - 1;
            while ((inner >= 0) && (key < input[inner])) {
                temp = input[inner];
                input[inner] = input[inner + 1];
                input[inner + 1] = temp;
                inner--;
            }
        }
        return input;
    }

    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        System.out.println(Arrays.toString(is.doInsertionSorting()));
    }
}

