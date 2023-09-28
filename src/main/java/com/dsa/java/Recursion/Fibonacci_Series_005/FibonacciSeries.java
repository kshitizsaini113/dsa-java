package com.dsa.java.Recursion.Fibonacci_Series_005;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class FibonacciSeries {
    Instant startingTIme;
    Instant endingTime;
    Duration timeElapsed;

    public int fibonacciLoop(int n) {
        int n1, n2;
        n1 = 0;
        n2 = 1;
        for(int i=0; i<n-2; i++) {
            int temp = n1+n2;
            n1 = n2;
            n2 = temp;
        }
        return n2;
    }

    public int fibonacciRecursive(int n) {
        if(n==0 || n==1) {
            return n;
        } else {
            return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
        }
    }

    private int[] memorizedFibonacci;

    public int fibonacciRecursiceMemorized(int n) {
        if(n==0 || n==1) {
            memorizedFibonacci[n] = n;
            return n;
        } else {
            if(memorizedFibonacci[n-2]==-1) {
                memorizedFibonacci[n-2] = fibonacciRecursiceMemorized(n-2);
            }
            if(memorizedFibonacci[n-1]==-1) {
                memorizedFibonacci[n-1] = fibonacciRecursiceMemorized(n-1);
            }
            return memorizedFibonacci[n-1] + memorizedFibonacci[n-2];
        }
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (to for number of fibonacci terms) : ");
        n = sc.nextInt();
        
        fibonacciSeries.startingTIme = Instant.now();
        System.out.println("n-th term of fibonacci is : " + fibonacciSeries.fibonacciLoop(n));
        fibonacciSeries.endingTime = Instant.now();
        fibonacciSeries.timeElapsed = Duration.between(fibonacciSeries.startingTIme, fibonacciSeries.endingTime);
        System.out.println("Elapsed time is " + fibonacciSeries.timeElapsed.toMillis() +" milliseconds");

        System.out.println("\n");

        fibonacciSeries.startingTIme = Instant.now();
        System.out.println("n-th term of fibonacci is : " + fibonacciSeries.fibonacciRecursive(n-1));
        fibonacciSeries.endingTime = Instant.now();
        fibonacciSeries.timeElapsed = Duration.between(fibonacciSeries.startingTIme, fibonacciSeries.endingTime);
        System.out.println("Elapsed time is " + fibonacciSeries.timeElapsed.toMillis() +" milliseconds");

        System.out.println("\n");

        fibonacciSeries.startingTIme = Instant.now();
        fibonacciSeries.memorizedFibonacci = new int[n];
        for(int i=0; i<n; i++) {
            fibonacciSeries.memorizedFibonacci[i] = -1;
        }
        System.out.println("n-th term of fibonacci is : " + fibonacciSeries.fibonacciRecursiceMemorized(n-1));
        fibonacciSeries.endingTime = Instant.now();
        fibonacciSeries.timeElapsed = Duration.between(fibonacciSeries.startingTIme, fibonacciSeries.endingTime);
        System.out.println("Elapsed time is " + fibonacciSeries.timeElapsed.toMillis() +" milliseconds");
    }
}
