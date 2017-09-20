package com.ret.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateNumberInArray {

    public static List<Integer> printDuplicateNumber(List<Integer> list) {

        HashSet<Integer> set = new HashSet<>();
        List<Integer> duplicate = new ArrayList<>();

        for(Integer index : list){
            if(!set.add(index)){
                duplicate.add(index);
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        printDuplicateNumber(Arrays.asList(1, 3, 4, 6, 7, 8, 4, 5, 6, 7, 7, 8, 8));
    }
}
