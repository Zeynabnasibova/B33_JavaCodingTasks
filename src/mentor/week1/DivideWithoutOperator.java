package mentor.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        divide(num1, num2);

    }

    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }

        int count = 0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println("The division is "+ count + " and remainder is " + num1);
    }

    /*
Write a method that can divide two numbers without using division operator

 */


}
