package PalwashayKhan.week01;

public class Even_Odd {
    public class EvenAndOdd {
        /*Write a method which can identifies given number is even or odd.
        Ex:
        identify(5) -> "Odd"
        identify(6) -> "Even"
       */
        public static void main(String[] args) {
            evenAndOdd(13);


        }
        public static void evenAndOdd(int input) {
            int result = 0;
            if (input % 2 == 0) {
                System.out.println(input + " is even number.");
            } else {
                System.out.println(input + " is odd number.");
            }

        }
    }
}
