package com.dsa.java.Recursion.Combination_Formula_006;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class CombinationFormula {
    Instant startingTIme;
    Instant endingTime;
    Duration timeElapsed;

    public int factorial(int n) {
        int fact = 1;
        for(int i=2; i<=n; i++) {
            fact*=i;
        }
        return fact;
    }

    public int combinationLoop(int n, int r) {
        int num = factorial(n);
        int den1 = factorial(r);
        int den2 = factorial(n-r);
        return ((num) / (den1*den2));
    }

    int combinationRecursive(int n, int r) {
        if(r==0 || n==r) {
            return 1;
        } else {
            return combinationRecursive(n-1, r-1) + combinationRecursive(n-1, r);
        }
    }

    public static void main(String[] args) {
        CombinationFormula combinationFormula = new CombinationFormula();
        
        int n, r;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        n = sc.nextInt();
        System.out.print("Enter r : ");
        r = sc.nextInt();

        combinationFormula.startingTIme = Instant.now();
        System.out.println("power of n is (using loop) : " + combinationFormula.combinationLoop(n, r));
        combinationFormula.endingTime = Instant.now();
        combinationFormula.timeElapsed = Duration.between(combinationFormula.startingTIme, combinationFormula.endingTime);
        System.out.println("Elapsed time is " + combinationFormula.timeElapsed.toMillis() +" milliseconds");

        System.out.println("\n");

        combinationFormula.startingTIme = Instant.now();
        System.out.println("power of n is (using recursion) : " + combinationFormula.combinationRecursive(n, r));
        combinationFormula.endingTime = Instant.now();
        combinationFormula.timeElapsed = Duration.between(combinationFormula.startingTIme, combinationFormula.endingTime);
        System.out.println("Elapsed time is " + combinationFormula.timeElapsed.toMillis() +" milliseconds");
    }
}
