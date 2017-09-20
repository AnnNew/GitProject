package com.m.fifth;

class InterThreadCom {
    int num;
    boolean valueSet = false;

    public synchronized void put(int num) {
        while (valueSet) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("put " + num);
        this.num = num;
        valueSet = true;
        notify();
    }

    public synchronized void get() {
        {
            while (!valueSet) {
                try {
                    wait();
                } catch (Exception e) {
                }
            }
            System.out.println("get " + num);
            valueSet = false;
            notify();
        }
    }
}

class Producer implements Runnable {
    InterThreadCom Itc;

    public Producer(InterThreadCom Itc) {
        this.Itc = Itc;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true)
        {
            Itc.put(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Consumer implements Runnable {
    InterThreadCom Itc;

    public Consumer(InterThreadCom Itc) {
        this.Itc = Itc;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        while (true) {
            Itc.get();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}





