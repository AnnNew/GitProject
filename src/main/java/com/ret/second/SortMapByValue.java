package com.ret.second;
import java.util.*;
public class SortMapByValue {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 29);
        map.put("E", 26);
        map.put("Z", 24);
        map.put("L", 22);
        map.put("B", 67);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue().compareTo(o1.getValue()));
            }
        });
        for(Map.Entry<String, Integer> entry : list){
            System.out.println("Sorted Value  " + entry.getKey() + " : " + entry.getValue());
        }
    }

}
