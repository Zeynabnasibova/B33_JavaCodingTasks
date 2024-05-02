package zeynab.week6;
public class sumOfDigits {
    //Write a method that can return the sum of the digits in a string

    public static void main(String[] args) {

        System.out.println("Sum of digit numbers is: " + sum("123rt4"));
    }

    public static int sum(String str) {

        //String str = "123rt4";

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char [] ch = str.toCharArray();

            if (Character.isDigit(ch[i])) { // check each index digit or not.if digit ->wrapper class metod

                int numStr = Integer.parseInt(String.valueOf(ch[i]));//conver String to int. return wrapper class obj

                // int numStr = Integer.parseInt(""+ch);

                sum += numStr; //take each
            }
        }
        //System.out.println("Sum of digit numbers is: " + sum);
        return sum;

    }

}