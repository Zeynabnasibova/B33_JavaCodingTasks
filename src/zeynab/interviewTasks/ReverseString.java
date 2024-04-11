package zeynab.interviewTasks;

import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        ReverseString obj = new ReverseString();
        System.out.println(obj.reverse(word));
    }
/*
Since the strings are immutable objects, we need to create another string to reverse them.
The string class doesn't have a reverse method to reverse the string.
So to reverse the String first, I will create a new string.
Then, iterate through each character of the original string and put it in front of the new string made.
And the new string is the reverse of the original string.
 */
    public String reverse(String word){

        String reversedWord = "";

        for(int i = word.length()-1;i>=0;i-- ){

            reversedWord += word.charAt(i);

        }
        return reversedWord;
    }
}
