package com.test.third;
public class SynchronizedInMutiThread  {
    public static void main(String[] args) throws Exception {
        DummyDo d = new DummyDo();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=100;i++){
                    d.increment();
                }
            }
        });
        Thread t2 = new Thread(()->
        {
                for (int i=1;i<=100;i++){
                    d.increment();
                }
            });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(d.count);
    }

}
