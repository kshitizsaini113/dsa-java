package com.dsa.java.Array.Binary_Search_002;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    int[] array;

    public int binarySearch(int element) {
        int start = 0;
        int end = array.length-1;
        while (start<=end) {
            int mid = (start + end) / 2;
            if(array[mid] == element) {
                return mid;
            } else if (array[mid] < element) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        Random random = new Random();
        binarySearch.array = new int[random.nextInt(500)];
        for(int i=0; i<binarySearch.array.length; i++) {
            binarySearch.array[i] = random.nextInt(2000);
        }
        int element = binarySearch.array[random.nextInt(binarySearch.array.length)];
        Arrays.sort(binarySearch.array);
        System.out.println(Arrays.toString(binarySearch.array));

        System.out.println("Index of 0 is : " + binarySearch.binarySearch(0));
        System.out.println("Index of " + element + " is : " + binarySearch.binarySearch(element));
    }
}
