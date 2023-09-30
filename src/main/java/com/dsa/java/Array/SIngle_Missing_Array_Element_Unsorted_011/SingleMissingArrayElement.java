package com.dsa.java.Array.SIngle_Missing_Array_Element_Unsorted_011;

import java.util.Arrays;

public class SingleMissingArrayElement {

    public int findMissing(int[] array, int low, int high) {
        int sumLow = (low-1)*(low)/2;
        int sumHigh = (high)*(high+1)/2;
        int sumArr = 0;
        for(int i: array) {
            sumArr += i;
        }
        return sumHigh-sumLow-sumArr;
    }

    public static void main(String[] args) {
        SingleMissingArrayElement singleMissingArrayElement = new SingleMissingArrayElement();
        int[] array = new int[]{6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17};
//        int[] array = new int[]{3, 5};
        System.out.println(Arrays.toString(array));
        System.out.println("Missing element in array is : " + singleMissingArrayElement.findMissing(array, 6, 17));
    }


}
