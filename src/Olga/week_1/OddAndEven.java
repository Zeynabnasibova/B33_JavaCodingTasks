package Olga.week_1;

public class OddAndEven {
    public static void oddOrEven(int x){

        if (x % 2 == 0){
            System.out.println(x + " is even");
        }else{
            System.out.println(x + " is odd");
        }
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 5;

        oddOrEven(a);
        oddOrEven(b);
    }
}
