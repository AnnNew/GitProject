package com.test.third;

class CountObject {
    static int i;

    public CountObject() {
        i++;
    }

    public void Counter() {
        System.out.println(i);
    }


    public static void main(String[] args) {

        CountObject obj1 = new CountObject();
        CountObject obj2 = new CountObject();
        CountObject obj3 = new CountObject();
        obj1.Counter();

    }
}



