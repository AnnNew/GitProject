package com.ret.second;

import java.util.*;

public class DuplicatesFromString {
    public List<String> removeDuplicateWordsFromList(List<String> list) {
        HashSet<String> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public int nThHighest(List<Integer> numbers) {
        Queue<Integer> queue = new PriorityQueue<>();

        for (int number : numbers) {
            queue.add(number);

            if (queue.size() > 2) {
                queue.poll();
            }
        }

        return queue.peek();
    }

    public static void main(String[] args) {
        DuplicatesFromString ds = new DuplicatesFromString();
//        System.out.println(ds.removeDuplicateWordsFromList(
//                Arrays.asList("onu", "sonu", "onu", "tilu", "tolu", "tilu", "ilu")));
        System.out.println(ds.nThHighest(Arrays.asList(1, 2, 3, 4, 5, 0, 10, 45, 100)));
    }
}
