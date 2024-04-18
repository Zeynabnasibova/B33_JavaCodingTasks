package Sino.week4;

import java.util.Arrays;

public class SameLetters {
     /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/


    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "world hello";
        boolean result = areSameLetters(str1, str2);
        System.out.println("Are '" + str1 + "' and '" + str2 + "' have same letters? " + result);


    }

    public static boolean areSameLetters(String str1, String str2) {
        // Check if the lengths of both strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        //We are  sorting both strings here and they will be in ascending order
        char[] charArray1 = str1.toCharArray(); // converting strings to charArray
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // And then compare the sorted strings
        return Arrays.equals(charArray1, charArray2);


    }
}