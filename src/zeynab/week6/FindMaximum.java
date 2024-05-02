package zeynab.week6;

public class FindMaximum {
    //Write a method that can find the maximum number from an int Array

    public static int maxNum(int [] arr){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i ++){

            if(arr[i] > max){

                max = arr[i];

            }
        }
        return max;

    }
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 5};
        System.out.println(maxNum(arr));
    }
}
