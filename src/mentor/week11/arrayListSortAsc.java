package mentor.week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayListSortAsc {
//Write a method that can sort the ArrayList in Ascending order without using the sort method

    public static void main(String[] args) {

        List<Integer> listOrig = new ArrayList<>(Arrays.asList(29, 5, 12, 96, 7, -43, 32, 71, 51, 84, 69));

        sortListASC(listOrig);

        System.out.println("Sorted list: " + listOrig);

    }


    public static void sortListASC(List<Integer> list) {

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

}
