package com.det.first;
public class Palindrome {
    public static void main(String[] args) {
        int t, n, s, r;
        n=121;
        s=0;
        t=n;
        while (n>0)
        {
            r = n%10;
            n = n/10;
            s = s*10+r;
        }
        if (t==s)
            System.out.println("Palindrome");
        else
            System.out.printf("Not a Palindrome");
    }
}
