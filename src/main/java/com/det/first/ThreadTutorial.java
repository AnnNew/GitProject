package com.det.first;
class First extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Love");
            try {Thread.sleep(1000);} catch (Exception e) {}
        }
    }
}
class Second extends Thread{
        public void run() {
            for (int j = 0; j < 5; j++) {
                System.out.println("Affection");
                try {Thread.sleep(1000);} catch (Exception e) {}
            }
        }
    }
