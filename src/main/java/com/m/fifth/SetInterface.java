package com.m.fifth;
import java.util.*;
public class SetInterface{

    public void blah()
    {
        List<String> al = new ArrayList<>();
        al.add("Hi");
        al.add("Monu");
        al.add("Find");
        al.add("Monu");
        al.add("Dupli STrings here");
        al.add("Find");

        al.forEach(element -> {
            if (al.indexOf(element) != al.lastIndexOf(element))
            {
                System.out.println(element);
            }
        });
    }

    public static void main(String[] args) {
        SetInterface setInterface = new SetInterface();
        setInterface.blah();
    }
}

//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new TreeSet<>();
//        set.add(34);
//        set.add(45);
//        set.add(39);
//        set.add(10);


//        Map<String,String> map = new HashMap<>();
//        map.put("A", "Hello");
//        map.put("C", "Hi");
//        map.put("H", "Hola");
//        map.put("D", "Hey");
//        map.put("B", "Yo");
//
//        Set<String> key = map.keySet();
//        for(String ki : key){
//            System.out.println(ki + " " +  map.get(ki));
//        }