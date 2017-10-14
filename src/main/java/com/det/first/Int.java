package com.det.first;

public class Interview {
    public String reverseString(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Please provide a valid input");
        }
        String output = "";
        for (int index = input.length() - 1; index >= 0; index--) {
            output += input.charAt(index);
        }
        return output;
    }
    public static void main(String[] args) {
        Interview interview = new Interview();
        System.out.println(interview.reverseString(null));

    }

}


