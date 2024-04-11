package Sino.week1;

public class DivideWithoutOperator {

    public static void main(String[] args) {

        int x = 26;
        int y = 4;

        int result =0;

        while ( x >= y) {
            x = x-y;
            result++;
        }

        System.out.println("result   = " + result);
        System.out.println("remainder = " + x);

    }
    /*
Write a method that can divide two numbers without using division operator

 */


}
