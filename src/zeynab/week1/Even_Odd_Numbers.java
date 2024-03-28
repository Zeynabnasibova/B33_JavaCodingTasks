package zeynab.week1;

import java.util.Scanner;

public class Even_Odd_Numbers {


    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();

        Even_Odd_Numbers obj = new Even_Odd_Numbers();

        System.out.println(obj.even_Odd(6));

    }

    public  String even_Odd(int number){

        if(number % 2 == 0){

            return "Even";

        }else{

            return "Odd";
        }

    }


}
/*
Write a method which can identifies given number is even or odd.
 Ex:
     idenitify(5) -> "Odd"
     idenitify(6) -> "Even"
 */