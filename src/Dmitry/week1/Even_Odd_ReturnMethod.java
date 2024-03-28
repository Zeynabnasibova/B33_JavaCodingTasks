package Dmitry.week1;

public class Even_Odd_ReturnMethod {

    // The solution contains a Method to Return the result:

    public static void main(String[] args) {

        int number = 21;

        String result = checkIfEven2(number);
        System.out.println(result) ;
    }


    public static String checkIfEven2(int num){

       String result;

        if (num %2 == 0){
            result = "even";
        }else{
            result = "odd";
        }
        return result;
    }
}

/*
Write a method which can identifies given number is even or odd.
Ex:
     idenitify(5) -> "Odd"
     idenitify(6) -> "Even"
*/

