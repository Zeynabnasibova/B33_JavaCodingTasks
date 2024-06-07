package PalwashayKhan.week01;

import java.util.Scanner;

public class DivideWithoutOperator {
    /*
    Divide two numbers without using division operator
     */
    public static void main(String[] args) {
        int a,b,c;
        int counter = 0;
        //1.create a scanner object
        Scanner input = new Scanner(System.in);

        //2.Ask for the input
        System.out.println("Enter First Number: ");

        //3.call appropriate scanner method
        a = input.nextInt();

        //2.Ask for the input repeated for number 2
        System.out.println("Enter Second Number: ");

        //3.call appropriate scanner method,repeated for number 2
        b= input.nextInt();


        c = a+b;//20+5=25
        while(c>b){//20>5
            c = c-b;
            counter++;
        }

        System.out.println("The result is : " + counter);
        //the result is 4 as the number of (loops)counter is 4
        //4-Scanner closed
        input.close();
    }
}

