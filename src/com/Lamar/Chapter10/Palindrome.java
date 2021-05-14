package com.Lamar.Chapter10;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String:"  );
        String s = input.nextLine();

//        display result
        System.out.println("Ignoring non-alphanumeric characters, \nis " + s + " a palindrome? " + isPalindrome(s));

//        return true if a string is a palindrome
    }

    public static boolean isPalindrome(String s) {
        String s1 = filter(s);


//    create a new string that is ther reversal of s1
        String s2 = reverse(s1);

//    compare if the reversal is the same as the original string
        return s2.equals(s1);
    }
//    Create a new string by eliminating non-alphnumeric chars
    public static String filter(String s) {
//        create a string builder
        StringBuilder stringBuilder = new StringBuilder();

//        examine each char in the string to skip alphanumberic chars
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                stringBuilder.append(s.charAt(i));
            }
        }
//        return  unfiltered string
        return stringBuilder.toString();
    }

//    Create a new string by reversing a specified string
        public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
        }


    }





