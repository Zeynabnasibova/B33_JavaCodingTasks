package Dmitry.week3;

public class reverseNegativeNumber {
    /*
    Write a return method that can reverse negative number and return it as int
    ex: given int is       ==> -53
        the output will be ==> -35
     */

    public static void main(String[] args) {

        // Method #1 The Best!
        int reverse = reverseTheBest(-753);
        System.out.println("The Best Reverse: " + reverse);

//        // Method #2
//        int number = reverseString(-123456789);
//        System.out.println("Reversed Int:  " + number);

//        // Method #3
//        int reverse2 = reverseParselInt(-864);
//        System.out.println("Method Rev. 3:  " + reverse2);
    }

    public static int reverseString(int number){

        String numberString = String.valueOf(number);
        System.out.println("Straight Str:  " + numberString);

        int reverseInt = 0;

        for (int j = numberString.length()-1; j>0;  j--) {
            char ch = numberString.charAt(j);
            int digit = Character.getNumericValue(ch);  // I must figure that method out!!!!!!!!!!!!!!!!!!!!!
            reverseInt = reverseInt *10 - digit;        // '- digit' <<= in order to make int number negative
        }
        return reverseInt;
    }

    public static int reverseTheBest (int number){

        System.out.println("Straight Integer: " + number);

        int revNum = 0;

        while (number !=0 ){

            int digit = number % 10;        // -753 % 10 =-3     > -75 % 10 =-5 > -7 % 10 =-7
            revNum = revNum*10 + digit;     // 0*10(0)-3 =-3     > -3*10-5 =-35 > -35*10-7=-357
            number/=10;                     // -735/10 =73 (int) > -73/10   =-7 > -7/10 = 0 (stop of while iteration)
        }
        return revNum;                      // We can change negative/positive number here if we need
    }

    public static int reverseParselInt(int number){
        String stringOfNumbers = String.valueOf(number);            // -864 String
        System.out.println("Straight Str:  " + stringOfNumbers);

        int reverseInt = 0;
        String reverseStr = "";

        for (int j = stringOfNumbers.length()-1; j>0;  j--) {
            reverseStr = reverseStr + stringOfNumbers.charAt(j);  // 468- (with j>=0) or 468 (with j>0)
        }
        reverseInt = Integer.parseInt(reverseStr);

        return -reverseInt;
    }
}