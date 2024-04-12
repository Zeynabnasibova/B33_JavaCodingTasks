package Dmitry.week3;

import java.util.Scanner;

public class primeNumber {
     /*
        Write a method that can check if a number is prime or not
        Prime numbers: 2, 3, 5, 7, 11, 13, 17, 19, 23
     */

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();

        boolean result = (ifPrimeMethod(number));

        if (result){
            System.out.println("Number " + number + " is Prime");
        } else {
            System.out.println("Number " + number + " is not Prime");
        }
    }

    public static boolean ifPrimeMethod(int number){
        if (number <=1){
            System.out.println("Number must be greater than 1");
            return false;
        } else if (number==2){
            return true;
        } else if (number%2==0){
            return false;
        }

        for (int i = 3; i*i<=number ; i+=2) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }

}
