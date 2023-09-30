package com.dsa.java.Array.Miltiple_Missing_Array_Elements_010;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleMissingArrayElements {
    int[] array = new int[]{6, 7, 8, 9, 11, 12, 15, 16, 18, 19, 20};

    public int[] missingElements() {
        List<Integer> missingElementList = new ArrayList<>();
        int diff = array[0];
        int i=1;
        while(i<array.length) {
            if(array[i]-i!=diff) {
                for(int j=0; j<array[i]-i-diff; j++) {
                    missingElementList.add(i+diff+j);
                }
                diff = array[i] - i;
            }
            i++;
        }
        return missingElementList.stream().mapToInt(k->k).toArray();
    }

    public static void main(String[] args) {
        MultipleMissingArrayElements multipleMissingArrayElements = new MultipleMissingArrayElements();

        System.out.println(Arrays.toString(multipleMissingArrayElements.array));
        System.out.println(Arrays.toString(multipleMissingArrayElements.missingElements()));
    }
}
