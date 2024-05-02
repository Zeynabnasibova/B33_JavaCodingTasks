package zeynab.week4;

import java.util.Arrays;

public class SameLetters {

    //I call my method inside the main method
    //Which evaluated true or false
    public static void main(String[] args) {

        System.out.println(sameLetter("abc","cab"));

    }


    public static boolean sameLetter(String first,String second){ //I am created my own method which return boolean value


        //First I convert the Strings in to charArrays
        char[] firstArr = first.toCharArray();
        char[] secondArr = second.toCharArray();

        //Then I sort Array
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);

        //Then check for equality
        return Arrays.equals(firstArr,secondArr);

    }
}
