package Dmitry.week2;

import java.util.ArrayList;
import java.util.Arrays;

public class Number_DivisibleBy3_5_15 {
   /*
    Write a program that can print the numbers between 1 ~ N that can be divisible by 3, 5, and 15.
            if the number can be divisible by 3, 5 and 15,
                then it should only be displayed in DivisibelBy15' section

            if the number can be divisible by 3 but cannot be divisible by 15,
                then it should only be displayed in DivisibelBy3' section

            if the number can be divisible by 5 but cannot be divisible by 15,
                then it should only be displayed in DivisibelBy5' section

        EX:
            input: 100
            Output:
                 Divisible By 15 15 30 45 60 75 90
                 Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
                 Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
    */


    public static void main(String[] args) {

        int n = 100;
        int number;

        String div15 = "";
        String div3  = "";
        String div5  = "";

        for (int i = 0; i < n; i++) {
            number = i+1;

            if (number%15==0) {
                div15 += number + " ";
            } else if (number%3==0) {
                div3 += number + " ";
            } else if (number%5==0){
                div5 += number + " ";
            }
        }

        System.out.println("Divisible By 15:  " + div15);
        System.out.println("Divisible By  3:  " + div3);
        System.out.println("Divisible By  5:  " + div5);

    }
}
