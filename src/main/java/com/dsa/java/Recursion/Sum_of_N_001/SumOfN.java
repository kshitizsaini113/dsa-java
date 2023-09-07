package com.dsa.java.Recursion.Sum_of_N_001;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class SumOfN {

    Instant startingTIme;
    Instant endingTime;
    Duration timeElapsed;

    public int sumOfNUsingFormulae(int n) {
        if(n>0) {
            return (((n) * (n + 1)) / 2);
        } else if (n==0) {
            return 0;
        } else {
            return -1;
        }
    }

    public int sumOfNUsingRecursion(int n) {
        if(n>0) {
            return (n + sumOfNUsingRecursion(n-1));
        } else if (n==0) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        SumOfN sumOfN = new SumOfN();

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (to calculate sum till n) : ");

        n = sc.nextInt();
        sumOfN.startingTIme = Instant.now();
        System.out.println("Sum of first n integers is (using recursion) : " + sumOfN.sumOfNUsingRecursion(n));
        sumOfN.endingTime = Instant.now();
        sumOfN.timeElapsed = Duration.between(sumOfN.startingTIme, sumOfN.endingTime);
        System.out.println("Elapsed time is " + sumOfN.timeElapsed.toMillis() +" milliseconds");

        System.out.println("\n");

        sumOfN.startingTIme = Instant.now();
        System.out.println("Sum of first n integers is (using formulae) : " + sumOfN.sumOfNUsingFormulae(n));
        sumOfN.endingTime = Instant.now();
        sumOfN.timeElapsed = Duration.between(sumOfN.startingTIme, sumOfN.endingTime);
        System.out.println("Elapsed time is " + sumOfN.timeElapsed.toMillis() +" milliseconds");
    }
}
