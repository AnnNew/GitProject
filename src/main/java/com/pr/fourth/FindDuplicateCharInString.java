package com.pr.fourth;

import java.util.HashSet;

public class FindDuplicateCharInString {

    public void findDuplicate(){
    String[] st = {"shi", "koi", "lio","lio"};

    HashSet<String> set = new HashSet<>();
    for(String arrayElement : st){
        if (!set.add(arrayElement)){
            System.out.println(arrayElement);
        }
    }

    }

    public static void main(String[] args) {
        FindDuplicateCharInString fs = new FindDuplicateCharInString();
        fs.findDuplicate();
    }
}
