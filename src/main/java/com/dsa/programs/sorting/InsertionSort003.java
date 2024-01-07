package com.dsa.programs.sorting;

import java.util.Arrays;

public class InsertionSort003 {
    public static void insertionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j>0; j--) {
                if(arr[j]<arr[j-1]) {
                    arr[j] ^= arr[j-1];
                    arr[j-1] ^= arr[j];
                    arr[j] ^= arr[j-1];
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{9, 5,1, 3, 6, 2, 7, 1 ,4};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
