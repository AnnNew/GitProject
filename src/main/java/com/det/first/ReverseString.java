package com.det.first;

public class ReverseString {
    public String reverseTheString(String str) {
        char[] strArray = str.toCharArray();

        String reverseString = "";
        for (int i = strArray.length - 1; i >= 0; i--)
        {
            reverseString += strArray[i];
        }
        return reverseString;
    }

    public static void main(String[] args) {
        ReverseString fdcs = new ReverseString();
        System.out.println(fdcs.reverseTheString("Kite"));
    }
}
