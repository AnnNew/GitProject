package com.m.fifth;

public class Elseif {

    /**
     * Reverses a given String.
     *
     * @param str The specified String
     * @return The reversed String.
     */
    public String reverseString(String str) {
        String rev = "";
        for (int index = str.length() - 1; index >= 0; index--) {
            rev += str.charAt(index);
        }
        return rev;
    }

    public static void main(String[] args) {
        Elseif elseif = new Elseif();
        elseif.reverseString("abcde");
    }
}

