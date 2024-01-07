package com.dsa.programs.sorting;

import java.util.Arrays;

public class BubbleSort002 {
    public static void bubbleSort(int[] arr) {
        for(int i=arr.length-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(arr[j] > arr[j+1]) {
                    arr[j]^=arr[j+1];
                    arr[j+1]^=arr[j];
                    arr[j]^=arr[j+1];
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{9, 5,1, 3, 6, 2, 7, 1 ,4};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
