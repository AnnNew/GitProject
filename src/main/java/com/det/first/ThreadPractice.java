package com.det.first;
public class ThreadPractice {
    public static void main(String[] args) {
        // Thread by using Lambda Expression
        //Thread Methods alive and join, priority
        Thread t1 = new Thread(()->
        {
            for (int i = 0; i < 3; i++) {
                System.out.println("Runnable");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        });
        Thread t2 = new Thread(()->
        {
            for (int i = 0; i < 3; i++) {
                System.out.println("Interface");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        });
//        t1.start();
//        t1.setPriority(6);
//        System.out.println(t1.getPriority());
//        System.out.println(t1.isAlive());
//        t1.setName("Hello");
//        System.out.println(t1.getName());
}
}
