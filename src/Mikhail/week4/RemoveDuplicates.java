package Mikhail.week4;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDup(str));

    }
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static String removeDup(String str) {
        Set<Character>updated = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            updated.add(str.charAt(i));
        }
        String result1 =updated.toString();
        String result2 = result1.replaceAll("[^a-zA-Z0-9]", "");
        return result2;

    }

}
