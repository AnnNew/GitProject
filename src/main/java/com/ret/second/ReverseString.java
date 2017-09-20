package com.ret.second;

public class ReverseString {

    public static void main(String[] args) {
        String str = "TreeIsGreen";
        String reverse = "";
        for(int index=str.length()-1; index>=0; index--){
         reverse = reverse + str.charAt(index);
        }
        System.out.println(reverse);
    }
// By using StringBuilder
    public String reverseMe(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; --i)
            sb.append(s.charAt(i));
        return sb.toString();
    }
}
