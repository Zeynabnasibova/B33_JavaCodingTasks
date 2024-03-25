package zeynab.week1;

import java.util.Scanner;

public class DivideWithoutOperator {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = input.nextInt();

        divide(num1,num2);

    }
    public static void divide(int num1, int num2){

        if(num2 == 0){
            System.out.println("Invalid number");

        }else{
            int result = 0;

            while (num1 >= num2){

                num1 = num1 - num2;// 6 - 3 = 3, 3 - 3 = 0

                result++;

            }

            System.out.println("num1/num2 = " + result + " and remainder = " + num1);
        }

    }
}
/*
Write a method that can divide two numbers without using division operator


 */