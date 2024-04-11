package zeynab.week3;

public class PrimeNumber {
    /*
    1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not
     */
    public static void main(String[] args) {
        int num = 3;
        System.out.println(primeNumber(num));
    }
    public static boolean primeNumber(int num ){//3

        if(num  <= 1){
            return false;
        }else{
            int count = 0;
            for(int i = 2; i <= num; i ++){
                if(num % i == 0 ){
                    count++;
                }
            }
            if(count == 1){
                return true;
            }else{
                return false;
            }
        }
    }
}