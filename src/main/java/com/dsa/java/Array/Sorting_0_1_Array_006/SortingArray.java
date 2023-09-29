package com.dsa.java.Array.Sorting_0_1_Array_006;

import java.util.Arrays;
import java.util.Random;

public class SortingArray {
    int[] array;

    public void sortArray() {
        int start = 0;
        int end = array.length-1;
        while (start<end) {
            while (array[start] != 1) start++;
            while (array[end] != 0) end--;
            if(start<end) {
                array[start]^=array[end];
                array[end]^=array[start];
                array[start]^=array[end];
            }
        }
    }

    public static void main(String[] args) {
        SortingArray sortingArray = new SortingArray();

        Random random = new Random();
        sortingArray.array = new int[random.nextInt(500)];
        for(int i=0; i<sortingArray.array.length; i++) {
            sortingArray.array[i] = random.nextInt(2);
        }

        System.out.println(Arrays.toString(sortingArray.array));

        sortingArray.sortArray();
        System.out.println(Arrays.toString(sortingArray.array));
    }
}
