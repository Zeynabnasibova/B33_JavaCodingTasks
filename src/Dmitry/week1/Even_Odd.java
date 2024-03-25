package Dmitry.week1;

public class Even_Odd {

    public static void main(String[] args) {

        int number = 33;
        checkIfEven(number);

    }

    public static void checkIfEven(int number) {

        if ( number % 2 == 0){
            System.out.println("Number " + number + " is even");
        } else{
            System.out.println("Number " + number + " is odd");
        }
    }

}

/*
Write a method which can identifies given number is even or odd.
 Ex:
     idenitify(5) -> "Odd"
     idenitify(6) -> "Even"
*/
