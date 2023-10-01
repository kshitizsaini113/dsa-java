package com.dsa.java.Array.Max_Min_in_Single_Scan_017;

import java.util.Arrays;
import java.util.Random;

public class MaxMin {

    public int[] maxMin(int[] array) {
        int[] pair = new int[2];
        pair[0] = array[0];
        pair[1] = array[1];
        for(int i: array) {
            if(pair[0] > i) {
                pair[0] = i;
            }
            if(pair[1] < i) {
                pair[1] = i;
            }
        }
        return pair;
    }
    public static void main(String[] args) {
        MaxMin maxMin = new MaxMin();
        Random random = new Random();
        int[] array = new int[random.nextInt(50)];
        for(int i=0; i<array.length; i++) {
            array[i] = random.nextInt(2000);
        }
        System.out.println(Arrays.toString(array));

        int[] max_min = maxMin.maxMin(array);
        System.out.println("Maximum element is : " + max_min[1]);
        System.out.println("Minimum element is : " + max_min[0]);
    }
}
