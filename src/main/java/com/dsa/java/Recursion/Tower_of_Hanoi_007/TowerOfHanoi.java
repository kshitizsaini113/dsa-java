package com.dsa.java.Recursion.Tower_of_Hanoi_007;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class TowerOfHanoi {
    Instant startingTIme;
    Instant endingTime;
    Duration timeElapsed;

    int numberOfSteps = 0;

    public void towerOfHanoi(int n, char a, char b, char c) {
        if(n>0) {
            numberOfSteps++;
            towerOfHanoi(n-1, a, c, b);
            System.out.println("Move disk from tower " + a + " to tower " + c);
            towerOfHanoi(n-1, b, a, c);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks in initial tower : ");
        n = sc.nextInt();

        towerOfHanoi.startingTIme = Instant.now();
        towerOfHanoi.towerOfHanoi(n, 'a', 'b', 'c');
        System.out.println();
        System.out.println("Number of steps required is/are : " + towerOfHanoi.numberOfSteps);
        towerOfHanoi.endingTime = Instant.now();
        towerOfHanoi.timeElapsed = Duration.between(towerOfHanoi.startingTIme, towerOfHanoi.endingTime);
        System.out.println("Elapsed time is " + towerOfHanoi.timeElapsed.toMillis() +" milliseconds");
    }
}
