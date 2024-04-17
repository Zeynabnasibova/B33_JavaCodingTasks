package zeynab.week3;

import java.util.Scanner;

public class ReverseNegativeNumber {
    /*
    2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = input.nextInt();//-123
       // int number = -123;// 321-

        System.out.println(reverse(number));

    }
    public static int reverse(int number){

        //  int number = -123;   123/10=12.3

        int reverse = 0;//0*10+3 = 321

        while (number != 0) {

            int remainder = number % 10;//-123%10=-3      12%10=-2  1%10=-1/zakon

            reverse = reverse * 10 + remainder;//0*10+3=3  -3*10+2=32  -32*10 + 1 =321

            number = number / 10;//123/10=-12   12/10 = -1   1/10 = 0

        }

        return reverse;

    }
}

/*
    //Write a return method that can reverse negative number and return it as int
    //ex: given int is ==> -53
    //  the output will be ==> -35
 */