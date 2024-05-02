package zeynab.week5;


public class findUnique {
    /*String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";*/

    public static void main(String[] args) {


        System.out.println(findTheUnique("AAABBBCCCDEF"));
    }

    public static String findTheUnique(String letter) {

        String unique = "";
        for (int i = 0; i < letter.length(); i++) {// in the outer loop String took first letter,then
            //

            int count = 0;  // I give int variable inside the outer loop because I want every time reset.

            for (int j = 0; j < letter.length(); j++) { //go inside the inner loop, and check whole String

                if (letter.charAt(i) == letter.charAt(j)) { // if letter which have in outer loop equal to the letter inner loop then go to the count
                    count++;
                }

            }

            if (count == 1) { // if count =1
                unique += letter.charAt(i); // in our unique container come that letter.

            }
        }
        return unique;
    }

}