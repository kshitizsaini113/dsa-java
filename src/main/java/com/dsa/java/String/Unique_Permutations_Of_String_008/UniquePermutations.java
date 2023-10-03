package com.dsa.java.String.Unique_Permutations_Of_String_008;

public class UniquePermutations {

    public void uniquePermutations(String str, String ans) {
        if(str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        boolean[] hash = new boolean[26];

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            String ros = str.substring(0, i) + str.substring(i+1);

            if(!hash[ch - 'A']) {
                uniquePermutations(ros, ans+ch);
                hash[ch-'A'] = true;
            }
        }
    }

    public static void main(String[] args) {
        UniquePermutations uniquePermutations = new UniquePermutations();
        String str = "AAB";
        System.out.println(str);
        System.out.println("Permutations are : ");
        uniquePermutations.uniquePermutations(str, "");
    }
}
