package mentor.week2;

public class Number_SwapTwoNumbers {

    /*
    Swap two variables' values without using a third variable
     */

    //solution 1
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);


    }
}
