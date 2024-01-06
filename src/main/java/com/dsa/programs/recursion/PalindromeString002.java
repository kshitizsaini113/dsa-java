package com.dsa.programs.recursion;

public class PalindromeString002 {

    public static boolean checkPalindrome(int i, String str) {
        if(i>=str.length()/2) {
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-i-1)) {
            return false;
        }
        return checkPalindrome(++i, str);
    }

    public static void main(String[] args) {
        String str = "testset";
        System.out.println("String \"" + str + "\" is palindrome : " + checkPalindrome(0, str));
    }
}
