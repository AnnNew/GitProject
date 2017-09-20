package com.ret.second;

public class PrintFibonacci {
    public void printFibonacciSeries(int limit){
        int first=1,second=1,current=0;
        System.out.print("1 1 ");
        while(current<=limit){
            current = first + second;
            System.out.print(current + " ");
            first = second;
            second = current;
        }
    }
    public static void main(String[] args) {
        PrintFibonacci printFibonacci = new PrintFibonacci();
        printFibonacci.printFibonacciSeries(40);
    }
}


