package com.dsa.java.String.Find_Duplicate_Character_005;

import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

    public char[] findDuplicates(String str) {
        List<Character> duplicateList = new ArrayList<>();
        char[] charArray = str.toCharArray();

        for(int i=0; i<str.length()-1; i++) {
            boolean repeted = false;
            for(int j=i+1; j<str.length(); j++) {
                if(charArray[i]!=' ' && (charArray[i]==charArray[j])) {
                    repeted = true;
                    charArray[j]=' ';
                }
            }
            if(repeted) {
                duplicateList.add(charArray[i]);
            }
        }

        CharBuffer buffer = CharBuffer.allocate(duplicateList.size());
        duplicateList.forEach(buffer::append);
        return buffer.array();
    }

    public char[] findDuplicatesHashing(String str) {
        List<Character> duplicateList = new ArrayList<>();
        char[] hashArray = new char[26];

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)<='Z' && str.charAt(i)>='A') {
                hashArray[str.charAt(i)-'A']++;
            } else if(str.charAt(i)<='z' && str.charAt(i)>='a') {
                hashArray[str.charAt(i)-'a']++;
            }
        }

        for(int i=0; i<26; i++) {
            if(hashArray[i]>1) {
                duplicateList.add((char) (i+'a'));
            }
        }

        CharBuffer charBuffer = CharBuffer.allocate(duplicateList.size());
        duplicateList.forEach(charBuffer::append);
        return charBuffer.array();
    }

    public static void main(String[] args) {
        FindDuplicates findDuplicates = new FindDuplicates();
        String str1 = "hellohihola";
        System.out.println(str1);
        System.out.println(Arrays.toString(findDuplicates.findDuplicates(str1)));

        System.out.println(str1);
        System.out.println(Arrays.toString(findDuplicates.findDuplicatesHashing(str1)));
    }
}
