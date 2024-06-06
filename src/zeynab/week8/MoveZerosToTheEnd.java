package zeynab.week8;

import java.util.Arrays;

public class MoveZerosToTheEnd {
      /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/
      public static void main(String[] args) {
          int []  numbers = new int[] {1,0,2,0,3,0,4,0};
          System.out.println(Arrays.toString(moveZerosToLst(numbers)));
      }

    public static  int [] moveZerosToLst(int [] numbers){

        //  numbers = new int[] {1,0,2,0,3,0,4,0};

        int index = 0;

        for(int i = 0; i < numbers.length; i++){

            if(numbers[i] != 0){

                numbers[index++] = numbers[i];//increments

            }
        }
        for(int i = index; i < numbers.length; i++){
            numbers[i] = 0;
        }
        return numbers;
    }

    }