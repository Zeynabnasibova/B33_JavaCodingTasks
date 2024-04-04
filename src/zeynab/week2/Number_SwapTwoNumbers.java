package zeynab.week2;

import java.util.Scanner;

public class Number_SwapTwoNumbers {
  /*
    Swap two variables' values without using a third variable
     */

    //solution 1

    public static void main(String [] args){

        Scanner  input  = new Scanner (System.in);

        System.out.println("Enter your first number");
        int num1 = input.nextInt();//5
        System.out.println("Enter your second number");
        int num2 = input.nextInt();//6

        swapTwoNumbers(num1,num2);
    }

    public static void swapTwoNumbers(int num1,int num2){
        num1 = num1 + num2;//5+6=11
        num2 = num1-num2;//11-6=5
        num1 = num1-num2;//11-5=6
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }

}
