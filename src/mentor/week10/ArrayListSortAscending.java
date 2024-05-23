package mentor.week10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSortAscending {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("Cydeo", "B25", "Java", "Selenium"));

        list.add("Aaron");

        sortingArrayAsc(list);
        sortingArraysDesc(list);
    }

    public static void sortingArrayAsc(ArrayList<String> arr) {

        String[] array = new String[arr.size()];
        array = arr.toArray(array);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void sortingArraysDesc(ArrayList<String> arr) {
        String[] array = new String[arr.size()];
        array = arr.toArray(array);
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

    }

}

