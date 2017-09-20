package com.det.first;
public class ThreadDemo {
    public static void main(String[] args) {
        // Thread by using Lambda Expression

        Thread t1 = new Thread(()->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        });
        Thread t2 = new Thread(()->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Interface");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        });
        t1.start();
        try {Thread.sleep(10);} catch (Exception e) {}
        t2.start();

// Thread by implementing the Runnable Interface
//        ThreadRunnable tr = new ThreadRunnable();
//        ThreadRunnable2 tr2 = new ThreadRunnable2();
//
//        Thread t1 = new Thread(tr);
//        Thread t2 = new Thread(tr2);
//        t1.start();
//        try {
//            Thread.sleep(10);
//        } catch (Exception e) {
//        }
//        t2.start();

        // Thread By extending a Class
//        First f = new First();
//        Second s = new Second();
//        f.start();
//        try {Thread.sleep(10);} catch (Exception e){}
//        s.start();
    }
}
