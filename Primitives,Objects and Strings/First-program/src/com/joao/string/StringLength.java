package com.joao.string;

public class StringLength {
    public static void main(String[] args) {
        String palindrome = "Dot saw i was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        //ut original string in an arrray of chars
        for (int i = 0 ; i< len ;  i++){
            tempCharArray[i] = palindrome.charAt(i);

        }

        //reverse array of chars

        for(int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len-1-j];
        }

        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }
}
