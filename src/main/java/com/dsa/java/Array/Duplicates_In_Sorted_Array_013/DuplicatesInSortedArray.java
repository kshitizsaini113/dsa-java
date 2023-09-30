package com.dsa.java.Array.Duplicates_In_Sorted_Array_013;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DuplicatesInSortedArray {

    public int[] findDuplicates(int[] array) {
        List<Integer> duplicateList = new ArrayList<>();
        int lastDuplicate = array[0]-1;
        for(int i=0; i<array.length-1; i++) {
            if(array[i] == array[i+1]) {
                if(lastDuplicate != array[i]) {
                    duplicateList.add(array[i]);
                    lastDuplicate = array[i];
                }
            }
        }
        return duplicateList.stream().mapToInt(k -> k).toArray();
    }

    public int[] findDuplicatedUsingHashing(int[] array) {
        List<Integer> duplicateList = new ArrayList<>();
        int[] hashArray = new int[array[array.length-1]+1];
        for(int i: array) {
            hashArray[i]++;
        }
        for(int i=0; i<hashArray.length; i++) {
            if(hashArray[i]>1) {
                duplicateList.add(i);
            }
        }
        return duplicateList.stream().mapToInt(k->k).toArray();
    }

    public static void main(String[] args) {
        DuplicatesInSortedArray duplicatesInSortedArray = new DuplicatesInSortedArray();

        Random random = new Random();
        int[] array = new int[15];
        for(int i=0; i<15; i++) {
            array[i] = random.nextInt(11);
        }
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(duplicatesInSortedArray.findDuplicates(array)));
        System.out.println(Arrays.toString(duplicatesInSortedArray.findDuplicatedUsingHashing(array)));
    }
}
