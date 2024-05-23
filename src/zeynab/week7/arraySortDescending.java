package zeynab.week7;

import java.util.Arrays;

public class arraySortDescending {  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/

    public static void main(String[] args) {
        int [] arr = new int []{10, 20, 7, 8, 90};
        System.out.println(Arrays.toString(sortDescending(arr)));
    }

    public static int [] sortDescending(int [] arr){

        arr = new int []{10, 20, 7, 8, 90};

        int temp = 0;

        for (int i = 0; i < arr.length ; i++) {//for loop iterates through each element

            for (int j = i; j < arr.length; j++) {//compares first element to each additional element

                if (arr[i] < arr[j]){//if the firdt element is less than the one it is compared to it is added to the temp

                    temp = arr[i];//values are sorted in temp in descending order

                    arr[i] = arr[j];//loop continius to iterate throgh all elements

                    arr[j] = temp;//element are stored in descending order
                }
            }

        }
        return arr;


    }

}