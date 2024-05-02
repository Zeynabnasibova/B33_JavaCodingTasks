package Dmitry.week4;

public class RemoveDuplicates {
    /* Write a return method that can remove the duplicated values from String
       Ex:  removeDup("AAABBBCCC")  ==> ABC */

    public static void main(String[] args) {

        String originalStr = "AAABBBCCC";
        String unique = removeDuplicates(originalStr);
        System.out.println("Only unique: " + unique);
    }

    public static String removeDuplicates (String str) {

        String newString = ""; // declaration of new String variable to store the reversed String

        for (int i = 0; i < str.length(); i++) {
            if (!newString.contains(String.valueOf(str.charAt(i)))) { // convert char symbols to String by using method String.valueOf()
                newString += str.charAt(i);
            }
        }
        return newString;
    }
}

