package Dmitry.week5;

public class findUnique {
    /*String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF";*/

    public static void main(String[] args) {

        String initialString = "AAABBBCCCDEF";
        String finalString = findUniqueSymbols(initialString);

        System.out.println("Final String: " + finalString);
    }

    public static String findUniqueSymbols (String initialArg){

        String uniqueSymbols = "";

        for (int i = 0; i < initialArg.length(); i++) {

            char ch = initialArg.charAt(i); // we are getting each symbol A-A-A-B...

            if (initialArg.indexOf(ch) == initialArg.lastIndexOf(ch)) { // If index is last = true - it means that symbol is unique!
                uniqueSymbols += ch;
            }
        }
        return uniqueSymbols;
    }
}




