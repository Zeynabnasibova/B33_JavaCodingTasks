package mentor.week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class arrayListSortDesc {
//Write a method that can sort the ArrayList in descending order without using the sort method

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 12, 96, 7, -41, 32, 71, 151, 84, 69));

        sortListDESC(list);

        System.out.println("Sorted list: " + list);

    }


    public static void sortListDESC(List<Integer> list) {

        int n = list.size(); // to learn the length of list

        for (int i = 0; i < n-1; i++) {    // 29, 29,

            // Comparing two indexes to search the maximum element:

            int maxIndex = i; // Create the variable to store the minim index > int minIndex = 0

            for (int j = i + 1; j < n; j++) {
                if (list.get(j) > list.get(maxIndex)) {
                    maxIndex = j; // =1
                }
            }
            // Swap min element with the first element
            int temp = list.get(maxIndex);

            list.set(maxIndex, list.get(i));
            list.set(i, temp);
        }

    }
}


