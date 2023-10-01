package com.dsa.java.Array.Pair_Of_Element_With_Sum_k_015;

import java.util.Arrays;

public class PairOfElement {

    public void pair(int[] array, int sum) {
        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i] + array[j] == sum) {
                    System.out.println("Pair of " + array[i] + " and " + array[j]);
                }
            }
        }
    }

    public void pairHashing(int[] array, int sum) {
        int maxElement = array[0];
        for(int i: array) {
            if(i>maxElement) {
                maxElement = i;
            }
        }
        int[] hashArray = new int[maxElement+1];
        for(int i: array) {
            hashArray[i]++;
            if(sum-i>=0 && sum-i!=i && hashArray[sum-i]>0) {
                System.out.println("Pair of " + i + " and " + (sum-i));
            }
        }
    }

    public static void main(String[] args) {
        PairOfElement pairOfElement = new PairOfElement();
        int[] array = new int[]{6, 3, 8, 10, 16, 7, 5, 2, 9, 14};
        System.out.println(Arrays.toString(array));
        System.out.println("\nPairs found using normal method : ");
        pairOfElement.pair(array, 10);
        System.out.println("\nPairs found using hashing : ");
        pairOfElement.pairHashing(array, 10);
    }
}
