package Mikhail.week4;

import java.util.HashSet;
import java.util.Set;

public class SameLetters {
    public static void main(String[] args) {
        String a1 = "abc";
        String a2 = "cab";
        System.out.println(sameCharacters(a1, a2));
    }

    public static boolean sameCharacters (String a1, String a2) {
        Set<Character> set1 = new HashSet<Character>();
        for (int i = 0; i < a1.length(); i++) {
            set1.add(a1.charAt(i));
        }
        Set<Character> set2 = new HashSet<Character>();
        for (int i = 0; i < a2.length(); i++) {
            set2.add(a2.charAt(i));
        }
        return set1.containsAll(set2);
    }

    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

}
