package Ayjamal.week5;

import java.util.HashSet;
import java.util.Set;

public class findUnique {

    public static void main(String[] args) {

        String input = "AAABBBCCCDEF";
        String uniqueCahrs = findUniqueCharacter(input);

        System.out.println("uniqueCahrs = " + uniqueCahrs);


    }

    public static String findUniqueCharacter(String input) {

        //Using a set to store unique characters
        Set<Character> uniqueChars = new HashSet<>();

        //Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Add the character to the set if it's not already present
            if (!uniqueChars.contains(currentChar)) {
                uniqueChars.add(currentChar);
            }

        }

        //Convert the set of unique characters back to a string
        StringBuilder result = new StringBuilder();
        for (Character c : uniqueChars) {
            result.append(c);
        }

        return result.toString();
    }


}
    /*String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";*/

