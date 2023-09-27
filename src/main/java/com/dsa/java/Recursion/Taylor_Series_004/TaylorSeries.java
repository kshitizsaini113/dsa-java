package com.dsa.java.Recursion.Taylor_Series_004;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class TaylorSeries {

    Instant startingTIme;
    Instant endingTime;
    Duration timeElapsed;

    static int p = 1, d = 1;

    public double taylorSeries(int power, int terms) {
        double r;
        if(terms == 0) {
            return 1;
        } else {
            r = taylorSeries(power, terms-1);
            p *= power;
            d *= terms;
            return (r + ((double) p/d));
        }
    }

    static double s = 1;

    public double taylorSeriesHornerRule(int power, int terms) {
        if(terms == 0) {
            return s;
        } else {
            s = 1 + (power*(s/terms));
            return taylorSeriesHornerRule(power, terms-1);
        }
    }

    public static void main(String[] args) {
        TaylorSeries taylorSeries = new TaylorSeries();

        int power, terms;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter power : ");
        power = sc.nextInt();
        System.out.print("Enter terms : ");
        terms = sc.nextInt();

        taylorSeries.startingTIme = Instant.now();
        System.out.println("power of n is (using recursion) : " + taylorSeries.taylorSeries(power, terms));
        taylorSeries.endingTime = Instant.now();
        taylorSeries.timeElapsed = Duration.between(taylorSeries.startingTIme, taylorSeries.endingTime);
        System.out.println("Elapsed time is " + taylorSeries.timeElapsed.toMillis() +" milliseconds");

        taylorSeries.startingTIme = Instant.now();
        System.out.println("power of n is (using recursion) : " + taylorSeries.taylorSeriesHornerRule(power, terms));
        taylorSeries.endingTime = Instant.now();
        taylorSeries.timeElapsed = Duration.between(taylorSeries.startingTIme, taylorSeries.endingTime);
        System.out.println("Elapsed time is " + taylorSeries.timeElapsed.toMillis() +" milliseconds");
    }
}
