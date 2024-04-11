package zeynab.week3;

public class ReverseNegativeNumber {
    /*
    2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int
     */
    public static void main(String[] args) {

        int number = -123;

        System.out.println(reverse(number));

    }
    public static int reverse(int number){

        //  int number = -123;

        int reverse = 0;

        while (number != 0) {

            int remainder = number % 10;

            reverse = reverse * 10 + remainder;

            number = number / 10;

        }

        return reverse;

    }
}

/*
1. Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int.

 */