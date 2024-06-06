package zeynab.week7;

import java.util.Arrays;

public class arraySortAscending {
        /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};*/
        public static void main(String[] args) {

            int[] arr = {10, 8, 9, 7};

            System.out.println(Arrays.toString(sortAscending(arr)));
        }



    public static int[] sortAscending(int[] arr) {

        arr = new int []{78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {//10

            for (int j = i; j < arr.length; j++) {//chek with 10 9 8 7

                if (arr[i] > arr[j]) { // if 10 more than 10 --> temp = 10 false
                    //if 10 more than 9 --.

                    temp = arr[i];//temp = 9

                    arr[i] = arr[j];//9 = 9

                    arr[j] = temp; // 9
                }
            }
        }

        return arr;
    }
}
