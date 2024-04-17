package Dmitry.week4;

public class FrequencyofCharacters {
    /* Write a return method that can find the frequency of characters
       Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {

        String characters = "AAABBCDD";
        frequencyOfCharacters(characters);
    }

    public static void frequencyOfCharacters(String chars) {
        // String newCharactersString = "";
        for (int i = 0; i < chars.length(); i++) {

            char ch = chars.charAt(i); //A
            int frequently = 1;

            for (int k = i + 1; k < chars.length(); k++) {
                if (chars.charAt(k) == ch) {
                    frequently++;
                }
            }
            if (frequently != 0) {
                System.out.print(ch + ":" + frequently + " ");
            }
        }
    }
}
