package com.ret.second;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharFromString {
    public void printDuplicateCharFromString(String str) {
        char[] characters = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (Character key : characters) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entryset = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entryset){
            if(entry.getValue()>1){
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        DuplicateCharFromString dcfs = new DuplicateCharFromString();
        dcfs.printDuplicateCharFromString("hippopotamus");

    }
}
