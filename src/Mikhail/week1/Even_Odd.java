package Mikhail.week1;

public class Even_Odd {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        System.out.println(oddEvenMethod(num1));
        System.out.println(oddEvenMethod(num2));
    }

    public static String oddEvenMethod(int num){
        if (num % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }

    /*
Write a method which can identifies given number is even or odd.
 Ex:
     idenitify(5) -> "Odd"
     idenitify(6) -> "Even"
 */



}
