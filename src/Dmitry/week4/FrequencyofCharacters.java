package Dmitry.week4;

public class FrequencyofCharacters {
    /* Write a return method that can find the frequency of characters
       Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {

        String string = "AAABBCDDAADDBBCCAAGGGGAAA";
        frequencyOfCharacters(string);
    }

    public static void frequencyOfCharacters(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i); // 'A'
            int frequently = 0;

            if (result.contains(String.valueOf(ch))){
                continue;
            }

            for (int k = i; k < str.length(); k++) {
                if (str.charAt(k) == ch) {
                    frequently++;
                }
            }
            result += String.valueOf(ch) + ":" + frequently + " ";
        }
        System.out.println(result + " <- our result");
    }
}
