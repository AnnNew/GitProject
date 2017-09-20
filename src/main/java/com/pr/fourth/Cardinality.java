package com.pr.fourth;

import java.util.*;

public class Cardinality {
    public static List<Integer> sortList(final List<Integer> unsortedList) {
        // error handling, null list
        Map<Integer, Integer> frequenciesMap = new HashMap<>();
        for (int index = 0; index <= 9; index++) {
            frequenciesMap.put(index, 0);
        }

        for (int element : unsortedList) {
            int frequency = frequenciesMap.get(element);
            frequenciesMap.put(element, frequency + 1);
        }

        List<Integer> sortedList = new ArrayList<>();
        for (int key = 0; key <= 9; key++) {
            int frequency = frequenciesMap.get(key);
            for (int index = 0; index <= frequency; index++) {
                sortedList.add(key);
            }
        }
        return sortedList;
    }

    public static void main(String[] args) {
        System.out.println(sortList(Arrays.asList(1, 1, 2, 3, 3, 9, 7, 7, 8, 4, 4, 7, 6, 6, 0, 0, 1)));
    }
}
