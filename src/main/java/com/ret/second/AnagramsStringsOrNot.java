package com.ret.second;

import java.util.Arrays;

public class AnagramsStringsOrNot {

    public static boolean anagramOrNot(String s1, String s2) {

        String copys1 = s1.replaceAll("\\s+", "");
        String copys2 = s2.replaceAll("\\s+", "");

        boolean status;

        if (copys1.length() != copys2.length()) {
            status = false;
        } else {
            char[] string1 = s1.toLowerCase().toCharArray();
            char[] string2 = s2.toLowerCase().toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);

            status = Arrays.equals(string1, string2);

        }
        if (status) {
            System.out.println("Anagrams");
        }
        else{
            System.out.println("not");
        }

        return false;
    }

    public static void main(String[] args) {
        anagramOrNot("kite", "kite");

    }

}
