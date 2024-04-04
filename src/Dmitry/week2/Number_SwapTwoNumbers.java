package Dmitry.week2;

import java.util.ArrayList;


public class Number_SwapTwoNumbers {

    /*
    Swap two variables' values without using a third variable
     */

    public static void main(String[] args) {

        //solution 1

        int a = 10;
        int b = 20;

        a = a+b;
        b = a-b;
        a = a-b;


        System.out.println("a = " + a);
        System.out.println("b = " + b);


        System.out.println("----------------------------------------------------------");

        //solution 2

        int x = 10;
        int y = 20;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);

        System.out.println("list1" + list);

        y = list.get(0);
        x = list.get(1);

        System.out.println("x new = " + x);
        System.out.println("y new = " + y);


        System.out.println("----------------------------------------------------------");

        //solution 3

        int k = 40;
        int m = 60;

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(k);
        list2.add(m);

        System.out.println("list2" + list2);

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                m = list2.get(i);
            } else if (i == 1) {
                k = list2.get(i);
            }
        }

        System.out.println("k new = " + k);
        System.out.println("m new = " + m);

    }
}
