package Mikhail.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {
       int a =18;
       int b = 6;
        System.out.println(divisionWithoutOperator(a,b));

    }

    public static int divisionWithoutOperator (int a, int b) {
        int counter = 0;
        while(a-b>=0){
            a = a-b;
            counter++;
        }
        return counter;


    }

    /*
Write a method that can divide two numbers without using division operator

 */


}
