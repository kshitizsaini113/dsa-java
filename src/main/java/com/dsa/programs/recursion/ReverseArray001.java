package com.dsa.programs.recursion;

import java.util.Arrays;

public class ReverseArray001 {

    public static void reverseArray(int[] arr, int start, int end) {
        if(start<end) {
            arr[start] ^= arr[end];
            arr[end] ^= arr[start];
            arr[start] ^= arr[end];
            reverseArray(arr, ++start, --end);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        reverseArray(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
