package com.dsa.java.Array.Linear_Search_001;

import java.util.Arrays;
import java.util.Random;

public class LinearSearch {
    int[] array;

    public int linearSearch(int element) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int improvedLinearSearch(int element) {
        for(int i=0; i<array.length; i++) {
            if(array[i] == element) {
                array[i]^=array[i-1];
                array[i-1]^=array[i];
                array[i]^=array[i-1];
                return i-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        Random random = new Random();
        linearSearch.array = new int[random.nextInt(500)];
        for(int i=0; i<linearSearch.array.length; i++) {
            linearSearch.array[i] = random.nextInt(2000);
        }
        System.out.println(Arrays.toString(linearSearch.array));

        System.out.println("Index of 0 is : " + linearSearch.linearSearch(0));
        int element = linearSearch.array[random.nextInt(linearSearch.array.length)];
        System.out.println("Index of " + element + " is : " + linearSearch.linearSearch(element));

        System.out.println();

        System.out.println("Index of 0 is : " + linearSearch.improvedLinearSearch(0));
        System.out.println("Index of " + element + " is : " + linearSearch.improvedLinearSearch(element));
    }
}
