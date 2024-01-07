package com.dsa.programs.sorting;

import java.util.Arrays;

public class SelectionSort001 {
    public static void selectionSort(int[] arr) {
        int min;
        int minIndex;
        for(int i=0; i<arr.length; i++) {
            min = arr[i];
            minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if(min>arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex!=i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{9, 5,1, 3, 6, 2, 7, 1 ,4};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
