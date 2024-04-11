package mentor.week2;

public class Number_SwapTwoNumbers {

    /*
    Swap two variables' values without using a third variable
     */

    //solution 1
    public static void main(String[] args) {
        //Swap two variable' values without using a third variable


        int a = 10;
        int b = 20;
        System.out.println("first a: " + a);
        System.out.println("first b: " + b);
        a = a + b; //a is 30 now
        b = a - b; //b is 10 now
        a = a - b; //a is 20 now
        System.out.println("new a: " + a);
        System.out.println("new b: " + b);


    }
}
