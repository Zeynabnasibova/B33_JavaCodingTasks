package mentor.week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListSortAsc {
//Write a method that can sort the ArrayList in Ascending order without using the sort method

    public static void main(String[] args) {

        List<Integer> listIntOrig = new ArrayList<>(Arrays.asList(29, 5, 12, 96, 7, -43, 32, 71, 51, 84, 69));

        List<String> listStringOrig = new ArrayList<>(Arrays.asList("Cherry", "Tomato", "Potato", "Apple", "Orange", "Water Mellon", "Egg plant", "Cabbage" ));

        sortListIntASC(listIntOrig);

        sortListStringASC(listStringOrig);

        System.out.println("Sorted Integer list: " + listIntOrig);
        System.out.println("Sorted String  list: " + listStringOrig);

    }


    public static void sortListIntASC(List<Integer> list) {

        int n = list.size(); // to learn the length of list

        for (int i = 0; i < n-1; i++) {    // 29, 29,

            // Comparing two indexes to search the minimum element:

            int minIndex = i; // Create the variable to store the minim index > int minIndex = 0

            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j; // =1
                }
            }
            // Swap min element with the first element
            int temp = list.get(minIndex);  // list.get(1) > int temp =5

            list.set(minIndex, list.get(i)); // list.set(1, 29)
            list.set(i, temp);               // list.set(0, 5)
        }
    }


    public static void sortListStringASC(List<String> list) {

        int n = list.size(); // to learn the length of list

        for (int i = 0; i < n-1; i++) {

            // Comparing two indexes to search the minimum element:

            int minIndex = i; // Create the variable to store the minim index > int minIndex = 0

            for (int j = i + 1; j < n; j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j; // =1
                }
            }
            // Swap min element with the first element
            String temp = list.get(minIndex);

            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }






}
