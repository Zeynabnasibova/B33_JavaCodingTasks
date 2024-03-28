package mentor.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        int x = 41;
        int y = 5;

        int result =0;

        while ( x >= y) {
            x = x-y;
            result++;
        }
        System.out.println(result);
        System.out.println(x);
        System.out.println("result  is " + result);



    }

    /*
Write a method that can divide two numbers without using division operator

 */



}
