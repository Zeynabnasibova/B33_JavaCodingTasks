package Dmitry.week1;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        int x = 41;
        int y = 5;

        int result =0;

        while ( x >= y) {
            x = x-y;
            result++;
        }

        System.out.println("result   = " + result);
        System.out.println("reminder = " + x);

    }
}

/*
Write a method that can divide two numbers without using division operator
*/
