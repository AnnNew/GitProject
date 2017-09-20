package com.det.first;
/**
 * Fizz-Buzz:
 * <p>
 * From 1 to input:
 * 1. If number is divisible by 3, print 'fizz'
 * 2. If number is divisible by 5, print 'buzz'
 * 3. If number is divisible by both, print 'fizz-buzz'
 * 4. If number is not divisible by either 3 ot 5, then print the number itself.
 */
public class FizzBuzz {
    public void isDivisible(int number) {
        for (int index = 1; index <= number; index++) {
            if ((index % 3) == 0 && (index % 5) == 0) {
                System.out.println("fizz-buzz");
            } else if (index % 3 == 0) {
                System.out.println("fizz");
            } else if (index % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(index);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.isDivisible(150);

    }
}