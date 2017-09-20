package com.m.fifth;

public class ProducerConsumerInterthread {

        public static void main(String[] args) {
            InterThreadCom Itc = new InterThreadCom();
            new Producer(Itc);
            new Consumer(Itc);
        }
    }

