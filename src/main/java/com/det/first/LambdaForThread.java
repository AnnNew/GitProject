package com.det.first;
    class LambdaForThread implements Runnable{
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        }
    }
    class LambdaForThread2 implements Runnable{
        public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("Interface");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        }
    }


