package Kawtar.week1;

public class Even_Odd {

    public static boolean isOdd(int i) {
        if (i % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }




    public static void main(String[] args) {


        boolean is_odd = isOdd(15);

        if(is_odd ){
            System.out.println("Even");
    }else {
            System.out.println("Odd");
        }

}

    /*
Write a method which can identifies given number is even or odd.
 Ex:
     idenitify(5) -> "Odd"
     idenitify(6) -> "Even"
 */



}
