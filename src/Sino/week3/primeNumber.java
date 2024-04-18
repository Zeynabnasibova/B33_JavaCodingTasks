package Sino.week3;

import java.util.Scanner;

public class primeNumber {

     /*
        Write a method that can check if a number is prime or not
        Prime numbers are: 2,3,5,7,11,13,17,23... greater than 1
     */

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        if (isPrimeNumber(number)){
            System.out.println( number + "  is a prime number");

        }else {
            System.out.println( number + "  is not a prime number");
        }

    }

    public static boolean isPrimeNumber(int number){

        if (number <= 1){
            return false;
        }

        for (int i = 2; i <=Math.sqrt(number); i++) {
            if (number%i == 0){
                return false;
            }

        }
        return true;
    }

}
