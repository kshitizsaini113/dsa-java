package com.dsa.java.Recursion.Factorial_002;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Factorial {

    Instant startingTIme;
    Instant endingTime;
    Duration timeElapsed;

    public int factorialUsingRecursion(int n) {
        if(n<0) {
            return -1;
        }
        else if(n>1) {
            return n * factorialUsingRecursion(n-1);
        } else {
            return 1;
        }
    }

    public int factorialUsingLoop(int n) {
        int factorial = 1;
        if(n<0) {
            return -1;
        }
        while(n>1) {
            factorial *= n;
            n--;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (to calculate factorial of) : ");

        n = sc.nextInt();
        factorial.startingTIme = Instant.now();
        System.out.println("Factorial of n is (using recursion) : " + factorial.factorialUsingRecursion(n));
        factorial.endingTime = Instant.now();
        factorial.timeElapsed = Duration.between(factorial.startingTIme, factorial.endingTime);
        System.out.println("Elapsed time is " + factorial.timeElapsed.toMillis() +" milliseconds");

        System.out.println("\n");

        factorial.startingTIme = Instant.now();
        System.out.println("Factorial of n is (using loop) : " + factorial.factorialUsingLoop(n));
        factorial.endingTime = Instant.now();
        factorial.timeElapsed = Duration.between(factorial.startingTIme, factorial.endingTime);
        System.out.println("Elapsed time is " + factorial.timeElapsed.toMillis() +" milliseconds");
    }
}
