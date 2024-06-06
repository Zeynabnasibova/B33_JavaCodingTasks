package zeynab.week7;

public class arrayFindMinimum {

    // Write a method that can find the minimum  number from an int Array


    public static int minNum(int [] arr){

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i ++){

            if(arr[i] < min){

                min = arr[i];

            }

        }
        return min;

    }

    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println(minNum(arr));
    }



}