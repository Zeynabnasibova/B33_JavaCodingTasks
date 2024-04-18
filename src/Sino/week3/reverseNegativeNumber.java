package Sino.week3;

public class reverseNegativeNumber {

    //Write a return method that can reverse negative number and return it as int
    //ex: given int is ==> -53
    //  the output will be ==> -35

    public static void main(String[] args) {
        int number = -4321;
        int reversedNumber = reverseNegative(number);
        System.out.println("Given negative number: " + number);
        System.out.println("Reversed negative number: " + reversedNumber);

    }

    public static int reverseNegative(int number) {        // 1. Make sure if the number is negative
                                                           // 2. Change to positive
        if (number < 0) {                                  // 3.Reverse the positive number
                                                           // 4.Return the negative of the reversed number
            int positiveNumber = -number;
            int reversedNumber = Integer.parseInt(new StringBuilder(String.valueOf(positiveNumber)).reverse().toString());
            return -reversedNumber;
        } else {
            return number;
        }
    }

}
