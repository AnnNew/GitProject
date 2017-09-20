package com.ret.second;

import java.util.Objects;

public class ReplaceCharFromString {

    public static String replaceCharFromString(String replace) {

        if(replace == null || replace.equals("")){
            throw new IllegalArgumentException("invalid");
        }

        replace = replace.toLowerCase().replaceAll("a", "b");

        return replace;
    }


    public static void main(String[] args) {
        System.out.println(replaceCharFromString(""));

    }

}
