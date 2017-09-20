package com.m.fifth;

public class EnumClass {
    enum Mobile{
        APPLE(100), SAMSUNG,HTC;
        int price;
        Mobile(){
            price = 90;
            System.out.println(price);
        }
        Mobile(int i){
            price = i;
        }
        public int getPrice(){
            return price;
        }
    }

}
