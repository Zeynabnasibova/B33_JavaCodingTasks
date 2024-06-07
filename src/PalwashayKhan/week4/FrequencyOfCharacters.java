package PalwashayKhan.week4;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
     /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AABBCCC"));
        System.out.println(FrequencyOfChars2("AABBCCC"));
    }

    public static String FrequencyOfChars(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++)
            if (!nonDup.contains("" + str.charAt(i)))
                nonDup += "" + str.charAt(i);
        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j))
                    count++;
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }
        return expectedResult;
    }

    public static String FrequencyOfChars2(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }



    //solution 3
    public String frequencyOfChars4(String str) {
        String nonDup = "", result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }
        for (int i = 0; i < nonDup.length(); i++) {
            int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
            result += "" + nonDup.charAt(i) + num;
        }

        return result;
    }
}

