package com.dsa.java.Recursion.Power_003;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Power {

    Instant startingTIme;
    Instant endingTime;
    Duration timeElapsed;

    public int powerUsingRecursion(int base, int exponent) {
        if(exponent == 0) {
            return 1;
        }
        return base * powerUsingRecursion(base, exponent-1);
    }

    public int powerUsingRecursionOptimized(int base, int exponent) {
        if(exponent == 0) {
             return 1;
        } else if(exponent%2 == 0) {
            return powerUsingRecursionOptimized(base*base, exponent/2);
        } else {
            return base*powerUsingRecursionOptimized(base*base, (exponent-1)/2);
        }
    }
    public static void main(String[] args) {
        Power power = new Power();

        int base, exponent;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (to calculate power of) : ");
        base = sc.nextInt();
        System.out.print("Enter exponent : ");
        exponent = sc.nextInt();

        power.startingTIme = Instant.now();
        System.out.println("power of n is (using recursion) : " + power.powerUsingRecursion(base, exponent));
        power.endingTime = Instant.now();
        power.timeElapsed = Duration.between(power.startingTIme, power.endingTime);
        System.out.println("Elapsed time is " + power.timeElapsed.toMillis() +" milliseconds");

        power.startingTIme = Instant.now();
        System.out.println("power of n is (using optimized-recursion) : " + power.powerUsingRecursionOptimized(base, exponent));
        power.endingTime = Instant.now();
        power.timeElapsed = Duration.between(power.startingTIme, power.endingTime);
        System.out.println("Elapsed time is " + power.timeElapsed.toMillis() +" milliseconds");
    }
}
