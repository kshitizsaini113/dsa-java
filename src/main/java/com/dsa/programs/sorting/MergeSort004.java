package com.dsa.programs.sorting;

import java.util.Arrays;

public class MergeSort004 {
    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] tempArr = new int[high-low+1];
        int idx = 0;
        int left = low;
        int right=mid+1;
        while(left<=mid && right<=high) {
            if(arr[left]<arr[right]) {
                tempArr[idx] = arr[left];
                left++;
                idx++;
            } else {
                tempArr[idx] = arr[right];
                right++;
                idx++;
            }
        }
        while(left<=mid) {
            tempArr[idx] = arr[left];
            left++;
            idx++;
        }
        while(right<=high) {
            tempArr[idx] = arr[right];
            right++;
            idx++;
        }
        for(int i=0; i<idx; i++) {
            arr[i+low] = tempArr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 5,1, 3, 6, 2, 7, 1 ,4};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
