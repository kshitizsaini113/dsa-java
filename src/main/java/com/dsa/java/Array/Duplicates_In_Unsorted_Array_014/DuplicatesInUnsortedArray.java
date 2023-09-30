package com.dsa.java.Array.Duplicates_In_Unsorted_Array_014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DuplicatesInUnsortedArray {
    public int[] findDuplicates(int[] array) {
        List<Integer> duplicateList = new ArrayList<>();
        for(int i=0; i<array.length-1; i++) {
            boolean duplicate = false;
            if(array[i]==-1) {
                continue;
            }
            for(int j=i+1; j<array.length; j++) {
                if(array[i]==array[j]) {
                    array[j] = -1;
                    duplicate = true;
                }
            }
            if(duplicate) {
                duplicateList.add(array[i]);
            }
        }
        return duplicateList.stream().mapToInt(k->k).toArray();
    }

    public static void main(String[] args) {
        DuplicatesInUnsortedArray duplicatesInUnsortedArray = new DuplicatesInUnsortedArray();

        Random random = new Random();
        int[] array = new int[15];
        for(int i=0; i<15; i++) {
            array[i] = random.nextInt(11);
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(duplicatesInUnsortedArray.findDuplicates(array)));
    }
}
