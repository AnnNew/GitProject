package com.ret.second;

public class ReverseStringUsingRecursion {

    public String useRecursion(String str)
    {
            if(str == null || str.length()<=1){
                return str;
            }
            // testing
        return useRecursion((str.substring(1))) + str.charAt(0);
    }


    public static void main(String[] args) {
        ReverseStringUsingRecursion reverseStringUsingRecursion = new ReverseStringUsingRecursion();
        System.out.println(reverseStringUsingRecursion.useRecursion("smile"));


    }
}
