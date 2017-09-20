package com.det.first;
class ThreadRunnable implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
class ThreadRunnable2 implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Interface");
            try {Thread.sleep(1000);} catch (Exception e) {}
    }
}
}


