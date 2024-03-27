package Kawtar.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {

     int resultat =  divideTwoNumbers(20,2) ;
        System.out.println(resultat);

    }


    public static int divideTwoNumbers(int a , int b ){
        int result=0;
        int c = a + b ;

        if( b == 0 ){ // because it gonna give us infinite loop
            System.out.println("division by 0 is impossible");
        }

        while(c>b){
            c = c-b;
            result ++;
        }

        return result;
    }
    /*
Write a method that can divide two numbers without using division operator

 */


}
