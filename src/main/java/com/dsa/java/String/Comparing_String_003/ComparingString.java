package com.dsa.java.String.Comparing_String_003;

public class ComparingString {
    public int compareStrings(String str1, String str2) {
        int i=0;
        while (i<str1.length() && i<str2.length()) {
            if(str1.charAt(i) < str2.charAt(i)) {
                return 1;
            } else if(str2.charAt(i) < str1.charAt(i)) {
                return -1;
            }
            i++;
        }
        if(i<str1.length()) {
            return -1;
        } else if(i<str2.length()) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        ComparingString comparingString = new ComparingString();
        String str1 = "Painter";
        String str2 = "Painting";
        String str3 = "Paint";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println("On Comparison : " + comparingString.compareStrings(str1, str2));

        System.out.println();

        System.out.println(str3);
        System.out.println(str1);
        System.out.println("On Comparison : " + comparingString.compareStrings(str3, str1));

        System.out.println();

        System.out.println(str3);
        System.out.println(str3);
        System.out.println("On Comparison : " + comparingString.compareStrings(str3, str3));

        System.out.println();

        System.out.println(str2);
        System.out.println(str1);
        System.out.println("On Comparison : " + comparingString.compareStrings(str2, str1));

        System.out.println();

        System.out.println(str1);
        System.out.println(str3);
        System.out.println("On Comparison : " + comparingString.compareStrings(str1, str3));
    }
}
