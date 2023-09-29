package com.dsa.java.Array.Left_Shift_004;

import java.util.Arrays;
import java.util.Random;

public class LeftShift {
    int[] array;

    public void leftShift() {
        int tmp = array[0];
        for(int i=0; i<array.length-1; i++) {
            array[i]=array[i+1];
        }
        array[array.length-1] = tmp;
    }

    public static void main(String[] args) {
        LeftShift leftShift = new LeftShift();
        Random random = new Random();
        leftShift.array = new int[random.nextInt(10)];
        for(int i=0; i<leftShift.array.length; i++) {
            leftShift.array[i] = random.nextInt(2000);
        }
        System.out.println(Arrays.toString(leftShift.array));
        leftShift.leftShift();
        System.out.println(Arrays.toString(leftShift.array));
    }
}
