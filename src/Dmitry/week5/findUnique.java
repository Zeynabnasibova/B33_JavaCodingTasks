package Dmitry.week5;

public class findUnique {
    /*String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";*/

    public static void main(String[] args) {

        String initialString = "AAABBBCCCDEF";
        String uniqueSymbols = "";

        for (int i = 0; i < initialString.length(); i++) {

            char ch = initialString.charAt(i); // A-A-A-B...

            if (initialString.indexOf(ch) == initialString.lastIndexOf(ch)) { // If index is last = true - it means that symbol is unique!
                uniqueSymbols += ch;
            }
        }
        System.out.println("uniqueSymbols = " + uniqueSymbols);

    }
}




