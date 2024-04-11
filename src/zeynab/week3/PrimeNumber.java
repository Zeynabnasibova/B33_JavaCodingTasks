package zeynab.week3;

import java.util.Scanner;

public class PrimeNumber {
    /*
    1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
     */
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number");

        int num = input.nextInt();

        System.out.println(primeNumber(num));
    }
    public static boolean primeNumber(int num ){//3

        if(num  <= 1){
            return false;
        }else{
            int count = 0;
            for(int i = 2; i <= num; i ++){

                if(num % i == 0 ){
                    count++;
                }
            }
            if(count == 1){
                return true;
            }else{
                return false;
            }
        }
    }
}