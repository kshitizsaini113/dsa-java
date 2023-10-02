package com.dsa.java.String.Check_Anagram_String_006;

public class CheckAnagram {
    public boolean checkAnagram(String str1, String str2) {
        String tempStr1 = str1.toLowerCase();
        String tempStr2 = str2.toLowerCase();
        char[] hashArray = new char[26];
        if(str1.length()!=str2.length()) {
            return false;
        }
        for(int i=0; i<str1.length(); i++) {
            hashArray[tempStr1.charAt(i)-'a']++;
            hashArray[tempStr2.charAt(i)-'a']--;
        }
        for(int i=0; i<26; i++) {
            if(hashArray[i]!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckAnagram checkAnagram = new CheckAnagram();
        String str1 = "decimal";
        String str2 = "MeDiCaL";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println("Are strings anagram : " + checkAnagram.checkAnagram(str1, str2));
    }
}
