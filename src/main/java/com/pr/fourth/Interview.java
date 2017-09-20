package com.pr.fourth;
import java.util.*;

public class Interview {
    public void pracCollections() {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(2,41);
        map.put(1,45);
        map.put(4,47);
        map.put(1,48);
        map.put(9,40);

        Set<Map.Entry<Integer,Integer>> values = map.entrySet();

        for(Map.Entry<Integer, Integer> ki : values){
            System.out.println(ki.getKey() + " " + ki.getValue());
        }

        Set<Integer> monu = map.keySet();

        for(Integer key : monu) {
            System.out.println(map.get(key));
        }
    }

    public static void main(String[] args) {
        Interview obj = new Interview();
        obj.pracCollections();
    }
}



