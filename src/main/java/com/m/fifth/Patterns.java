package com.m.fifth;

public class Patterns {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("Monu.PerfectNumber");
            System.out.println(c.isInterface());
        } catch (ClassNotFoundException c) {}
    }


}



