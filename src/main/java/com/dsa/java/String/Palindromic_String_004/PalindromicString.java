package com.dsa.java.String.Palindromic_String_004;

public class PalindromicString {

    public boolean checkPalindromic(String str) {
        int start = 0, end = str.length()-1;
        while (start<end) {
            int i = str.charAt(start) - str.charAt(end);
            if(i!=0 && i!='a'-'A' && i!='A'-'a') {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        PalindromicString palindromicString = new PalindromicString();
        String str1 = "Hello";
        String str2 = "HelleH";
        String str3 = "Helleh";

        System.out.println(str1);
        System.out.println("Is palindromic : " + palindromicString.checkPalindromic(str1));
        System.out.println(str2);
        System.out.println("Is palindromic : " + palindromicString.checkPalindromic(str2));
        System.out.println(str3);
        System.out.println("Is palindromic : " + palindromicString.checkPalindromic(str3));
    }
}
