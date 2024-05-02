package Dmitry.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static void main(String[] args) {

        String initialString = "ABCDEFGH";

        String reversedResult = reverse(initialString);

        System.out.println("ReversedResult: " + reversedResult);

    }

    public static String reverse(String initialArg){
        String reverseString = "";
        for (int i = initialArg.length()-1; i >=0; i--) {
            reverseString = reverseString + initialArg.charAt(i);
        }
        return reverseString;

    }




}
