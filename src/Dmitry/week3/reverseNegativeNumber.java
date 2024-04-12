package Dmitry.week3;

public class reverseNegativeNumber {
    /*
    Write a return method that can reverse negative number and return it as int
    ex: given int is       ==> -53
        the output will be ==> -35
     */

    public static void main(String[] args) {

        // Method #1
//        int RRR = reverseNumber(1234567);
//        int ReverseRRR = - RRR;
//        System.out.println("Reversed Int:  " + RRR);
//        System.out.println("Negative Rev: " + ReverseRRR);

        // Method #2
        int reverse = reverseNum2(753);
        System.out.println(reverse);


    }

    public static int reverseNumber(int number){

        String numberString = String.valueOf(number);
        System.out.println("Straight Str:  " + numberString);

        int reverseInt = 0;

        for (int i = 0, j = numberString.length() -1; i <numberString.length(); i++, j--) {
            char ch = numberString.charAt(j);
            int digit = Character.getNumericValue(ch);
            reverseInt = reverseInt *10 + digit;
        }
        return reverseInt;
    }

    public static int reverseNum2 (int number){

        int revNum = 0;

        while (number !=0 ){

            int digit = number % 10;

            revNum = revNum*10 + digit;
            number/=10;
        }
        return -revNum;
    }
}