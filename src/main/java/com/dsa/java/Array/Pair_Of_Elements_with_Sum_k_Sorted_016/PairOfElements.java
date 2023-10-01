package com.dsa.java.Array.Pair_Of_Elements_with_Sum_k_Sorted_016;

import java.util.Arrays;

public class PairOfElements {

    public void pairOfElements(int[] array, int sum) {
        int start=0, end=array.length-1;
        while(start<end) {
            if(array[start] + array[end] == sum) {
                System.out.println("Pair of " + array[start] + " and " + array[end]);
                start++;
                end--;
            } else if(array[start] + array[end] > sum) {
                end--;
            } else {
                start++;
            }
        }
    }
    public static void main(String[] args) {
        PairOfElements pair = new PairOfElements();
        int[] array = new int[]{6, 3, 8, 10, 16, 7, 5, 2, 9, 14};
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        System.out.println("Pairs found : ");
        pair.pairOfElements(array, 10);
    }
}
