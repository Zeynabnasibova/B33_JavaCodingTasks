package Sino.week4;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

     /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {

        String givenString = "AABBBCCDDD";
        String noDuplicates = removeDuplicates(givenString);
        System.out.println("Given String = " + givenString);
        System.out.println("Removed duplicates: " + noDuplicates);
    }

    public static String removeDuplicates (String str) {

        String withoutDuplicate = "";

        for (int i = 0; i < str.length(); i++) {
            if (!withoutDuplicate.contains(String.valueOf(str.charAt(i)))) {
                withoutDuplicate += str.charAt(i);
            }
        }
        return withoutDuplicate;


    }

}
