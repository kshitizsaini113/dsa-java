package com.dsa.java.Array.Is_Array_Sorted_005;

import java.util.Arrays;
import java.util.Random;

public class CheckSorted {
    int[] array;

    public boolean isSorted() {
        for (int i=0; i<array.length-1; i++) {
            if(array[i] > array[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckSorted checkSorted = new CheckSorted();
        
        Random random = new Random();
        checkSorted.array = new int[random.nextInt(500)];
        for(int i=0; i<checkSorted.array.length; i++) {
            checkSorted.array[i] = random.nextInt(2000);
        }

        System.out.println(Arrays.toString(checkSorted.array));
        System.out.println("Is array sorted : " + checkSorted.isSorted());

        System.out.println();

        Arrays.sort(checkSorted.array);
        System.out.println(Arrays.toString(checkSorted.array));
        System.out.println("Is array sorted : " + checkSorted.isSorted());
    }
}
