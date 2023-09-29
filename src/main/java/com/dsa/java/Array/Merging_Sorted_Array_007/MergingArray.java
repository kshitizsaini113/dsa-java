package com.dsa.java.Array.Merging_Sorted_Array_007;

import java.util.Arrays;
import java.util.Random;

public class MergingArray {
    int[] array1;
    int[] array2;
    int[] array;

    public void mergeArray() {
        array = new int[array1.length + array2.length];

        int i=0, j=0;
        int idx = 0;

        while (i!=array1.length && j!=array2.length) {
            if(array1[i] < array2[j]) {
                array[idx] = array1[i];
                i++;
            } else {
                array[idx] = array2[j];
                j++;
            }
            idx++;
        }

        while(i<array1.length) {
            array[idx] = array1[i];
            idx++; i++;
        }

        while(j<array2.length) {
            array[idx] = array2[j];
            idx++; j++;
        }
    }

    public static void main(String[] args) {
        MergingArray mergingArray = new MergingArray();

        Random random = new Random();
        mergingArray.array1 = new int[random.nextInt(10)];
        for(int i=0; i<mergingArray.array1.length; i++) {
            mergingArray.array1[i] = random.nextInt(100);
        }
        Arrays.sort(mergingArray.array1);

        mergingArray.array2 = new int[random.nextInt(10)];
        for(int i=0; i<mergingArray.array2.length; i++) {
            mergingArray.array2[i] = random.nextInt(100);
        }
        Arrays.sort(mergingArray.array2);

        System.out.println(Arrays.toString(mergingArray.array1));
        System.out.println(Arrays.toString(mergingArray.array2));
        mergingArray.mergeArray();
        System.out.println(Arrays.toString(mergingArray.array));
    }
}
