package com.dsa.java.String.Change_Case_Of_String_001;

public class ChangeCase {

    public String changeCase(String str) {
        char[] revertedCase = new char[str.length()];
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) <= 'Z' && str.charAt(i) >= 'A') {
                revertedCase[i] = (char) (str.charAt(i) - 'A' + 'a');
            } else if(str.charAt(i) <= 'z' && str.charAt(i) >= 'a') {
                revertedCase[i] = (char) (str.charAt(i) - 'a' + 'A');
            } else {
                revertedCase[i] = str.charAt(i);
            }
        }
        return new String(revertedCase);
    }

    public static void main(String[] args) {
        ChangeCase changeCase = new ChangeCase();

        String str = "Test String";
        System.out.println(str);
        System.out.println("String with opposite case is : " + changeCase.changeCase(str));
    }
}
