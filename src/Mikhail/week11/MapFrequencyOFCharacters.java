package Mikhail.week11;

import java.util.HashMap;
import java.util.Map;

public class MapFrequencyOFCharacters {
    //  Write a method that prints the frequency of each character from a String.

    public static void main(String[] args) {

        String testString = "AAddssaddasdadvvpasd11123";
        Map<Character,Integer> taskAnswer =charCount(testString);
        System.out.println(taskAnswer);
    }

    public static Map<Character,Integer> charCount(String testString) {
        Map<Character, Integer> countEach = new HashMap<>();
        for (char c : testString.toCharArray()) {
            if (!countEach.containsKey(c)){
                countEach.put(c,1);
            }
            else {
                int actualCounter =countEach.get(c);
                countEach.put(c,actualCounter+1);
            }

        }
        return countEach;
    }
}

