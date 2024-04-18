package zeynab.week4;

public class FrequencyofCharacters {


    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AAABBCDDAA"));

    }
        /*
    Q1: String -- Frequency of Characters
Write a return method that can find the frequency of characters Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */

    public static String frequencyOfCharacters(String word){ //String word = "AAABBCDD


        String letter = "";// container//        //ABCD

        for(int i = 0; i < word.length();i++){

            if(!letter.contains("" + word.charAt(i))){ //chek

                letter += "" + word.charAt(i);

            }

        }
       // System.out.println(letter);



        //letter ABCD
        //word  AAABBCDDAA
        String result = "";

        for(int i = 0; i < letter.length(); i++){

            int count = 0;//3

            for(int j = 0; j < word.length(); j++){

                if(letter.charAt(i) == word.charAt(j)){

                    count++;
                }
            }

            result += letter.charAt(i) + "" + count;

        }
        return result;

    }

}
