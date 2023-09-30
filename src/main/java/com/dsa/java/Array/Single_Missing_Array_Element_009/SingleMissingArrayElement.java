package com.dsa.java.Array.Single_Missing_Array_Element_009;

import java.util.Arrays;

public class SingleMissingArrayElement {
    int[] array = new int[]{6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17};

    public int missingElement() {
        int diff = array[0];
        int i=1;
        while(i<array.length) {
            if(array[i]-i!=diff) {
                break;
            }
            i++;
        }
        return i+diff;
    }
    public static void main(String[] args) {
        SingleMissingArrayElement singleMissingArrayElement = new SingleMissingArrayElement();
        System.out.println(Arrays.toString(singleMissingArrayElement.array));
        System.out.println("Missing array element is : " + singleMissingArrayElement.missingElement());
    }
}
