package com.dsa.programs.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintSubsequence004 {

    public static List<Integer> subsequenceList = new ArrayList<>();
    public static void printSubsequences(int index, int[] array) {
        if(index==array.length) {
            System.out.println(subsequenceList.toString());
            return;
        }
        subsequenceList.add(array[index]);
        printSubsequences(index+1, array);
        subsequenceList.remove(Integer.valueOf(array[index]));
        printSubsequences(index+1, array);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 2};
        System.out.println("All subsequence of array " + Arrays.toString(arr));
        printSubsequences(0, arr);
    }
}
