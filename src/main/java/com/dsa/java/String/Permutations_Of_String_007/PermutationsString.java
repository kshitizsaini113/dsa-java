package com.dsa.java.String.Permutations_Of_String_007;

public class PermutationsString {
    char[] result;
    int[] hashArray;

    public void permutations(String str) {
        result = new char[str.length()];
        hashArray = new int[str.length()];
        printPermutations(str, 0);
    }

    public void printPermutations(String str, int k) {
        if(k==str.length()) {
            System.out.println(result);
        } else {
            for(int i=0; i<str.length(); i++) {
                if(hashArray[i]==0) {
                    result[k]=str.charAt(i);
                    hashArray[i]=1;
                    printPermutations(str, k+1);
                    hashArray[i]=0;
                }
            }
        }
    }

    public void permutations2(String str) {
        result = str.toCharArray();
        int low = 0, high = str.length()-1;
        printPermutations2(result, low, high);
    }

    public void printPermutations2(char[] string, int low, int high) {
        if(low==high) {
            System.out.println(string);
        } else {
            for(int i=low; i<=high; i++) {
                char temp1 = string[low];
                string[low] = string[i];
                string[i] = temp1;
                printPermutations2(string, low+1, high);
                char temp2 = string[low];
                string[low] = string[i];
                string[i] = temp2;
            }
        }
    }

    public void printPermutations3(String str, String answer) {
        if(str.isEmpty()) {
            System.out.println(answer + " ");
            return;
        }

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i+1);
            printPermutations3(ros, answer+ch);
        }
    }

    public static void main(String[] args) {
        PermutationsString permutationsString = new PermutationsString();
        String str = "ABC";

        System.out.println(str);
        System.out.println("Permutations are : ");
        permutationsString.permutations(str);

        System.out.println();

        System.out.println(str);
        System.out.println("Permutations are : ");
        permutationsString.permutations2(str);

        System.out.println();

        System.out.println(str);
        System.out.println("Permutations are : ");
        permutationsString.printPermutations3(str, "");
    }
}
