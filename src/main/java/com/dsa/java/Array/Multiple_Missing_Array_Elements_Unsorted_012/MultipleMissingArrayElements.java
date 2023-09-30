package com.dsa.java.Array.Multiple_Missing_Array_Elements_Unsorted_012;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleMissingArrayElements {

    public int[] findMissing(int[] array, int low, int high) {
        List<Integer> missingElements = new ArrayList<>();
        int[] hashArray = new int[high-low+1];
        for(int i: array) {
            hashArray[i-low]++;
        }
        for(int i=0; i<hashArray.length; i++) {
            if(hashArray[i]==0) {
                missingElements.add(i+low);
            }
        }
        return missingElements.stream().mapToInt(k->k).toArray();
    }

    public static void main(String[] args) {
        MultipleMissingArrayElements multipleMissingArrayElements = new MultipleMissingArrayElements();
        int[] array = new int[]{6, 7, 8, 9, 11, 12, 15, 16, 18, 19, 20};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(multipleMissingArrayElements.findMissing(array, 6, 20)));
    }
}
