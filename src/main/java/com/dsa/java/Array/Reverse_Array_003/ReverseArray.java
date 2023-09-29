package com.dsa.java.Array.Reverse_Array_003;

import java.util.Arrays;
import java.util.Random;

public class ReverseArray {
    int[] array;

    public void reverseArray() {
        for(int i=0, j=array.length-1; i<j; i++, j--) {
            array[i]^=array[j];
            array[j]^=array[i];
            array[i]^=array[j];
        }
    }

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        Random random = new Random();
        reverseArray.array = new int[random.nextInt(500)];
        for(int i=0; i<reverseArray.array.length; i++) {
            reverseArray.array[i] = random.nextInt(2000);
        }
        System.out.println(Arrays.toString(reverseArray.array));
        reverseArray.reverseArray();
        System.out.println(Arrays.toString(reverseArray.array));
    }
}
