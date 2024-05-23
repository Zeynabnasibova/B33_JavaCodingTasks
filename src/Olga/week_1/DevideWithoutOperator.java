package Olga.week_1;

public class DevideWithoutOperator {
        /*
Write a method that can divide two numbers without using division operator

 */
        public static void main(String[] args) {
            int a = 25;
            int b = 5;
            double c = 0;

            if(b == 0){
                System.out.println("Number can be greater than zero");
            }
            while (a >= b) {
                a = a - b;
                c++;
            }
            System.out.println(c);


        }

}
