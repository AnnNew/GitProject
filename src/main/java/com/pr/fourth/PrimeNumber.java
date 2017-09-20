package com.pr.fourth;

public class PrimeNumber {
    public Integer isPrime(int number) {
        for (int index = 2; index < number; index++) {
            if (number % index == 0)
                return null;
        }
        return number;
    }

    public void printNumber2() {
        for (int index = 3; index <= 100; index++) {
            if (isPrime(index) != null)
                System.out.println(isPrime(index));
        }
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.printNumber2();
    }
}
