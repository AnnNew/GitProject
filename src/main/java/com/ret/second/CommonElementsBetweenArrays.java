package com.ret.second;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElementsBetweenArrays {
    public static void commonElement(){
      Integer[] i1 = {1,2,3,4,5};
        Integer[] i2 = {2,3,6,7,8,8};
        Set<Integer> set1= new HashSet<>(Arrays.asList(i1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(i2));
        set1.retainAll(set2);
        System.out.println(set1);

       /*   String[] list1 = {"one", "two", "four", "five"};
        String[] list2 = {"three", "four", "five", "nine"};
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0; j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    set.add(list1[i]);
                }
            }
        }
        System.out.println(set);
 */

    }
    public static void main(String[] args){
        commonElement();
    }
}

