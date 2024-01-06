package com.dsa.programs.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsequenceWithSum005 {
    public static List<Integer> subsequenceList = new ArrayList<>();
    public static void subSequenceWithSum(int index, int[] array, int sum, int currSum) {
        if(index==array.length) {
            if(sum==currSum){
                System.out.println(subsequenceList.toString());
            }
            return;
        }
        subsequenceList.add(array[index]);
        currSum+=array[index];
        subSequenceWithSum(index+1, array, sum, currSum);
        subsequenceList.remove(Integer.valueOf(array[index]));
        currSum-=array[index];
        subSequenceWithSum(index+1, array, sum, currSum);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1};
        System.out.println("All subsequence of array " + Arrays.toString(arr) + " with sum 2 are : ");
        subSequenceWithSum(0, arr, 2, 0);
    }
}
