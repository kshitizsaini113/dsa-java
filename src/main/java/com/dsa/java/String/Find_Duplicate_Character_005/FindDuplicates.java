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
    public static void main(String[] args) {
        FindDuplicates findDuplicates = new FindDuplicates();
        String str1 = "hellohihola";
        System.out.println(str1);
        System.out.println(Arrays.toString(findDuplicates.findDuplicates(str1)));
    }
}
