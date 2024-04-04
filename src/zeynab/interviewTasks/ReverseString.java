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

    public String reverse(String word){

        String conteyner = "";

        for(int i = word.length()-1;i>=0;i-- ){

            conteyner += word.charAt(i);

        }
        return conteyner;
    }
}
