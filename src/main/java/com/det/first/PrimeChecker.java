package com.det.first;

public class PrimeChecker {

    public boolean isPrime (int number) {

        if (number < 2) {
            return false;
        }

        for (int index = 2; index < Math.sqrt(number); index++) {
            System.out.println(index);
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeChecker primeChecker = new PrimeChecker();
        System.out.println(primeChecker.isPrime(31));
    }
}




