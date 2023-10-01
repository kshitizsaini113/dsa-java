package com.dsa.java.String.Reversing_a_String_002;

public class ReverseString {

    public String reverseString(String str) {
        char[] reverseStr = new char[str.length()];
        int start=0, end=str.length()-1;
        while(start<=end) {
            reverseStr[start]=str.charAt(end);
            reverseStr[end]=str.charAt(start);
            start++; end--;
        }
        return new String(reverseStr);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String str = "Test String";
        System.out.println(str);
        System.out.println("Reversed String is : " + reverseString.reverseString(str));
    }
}
