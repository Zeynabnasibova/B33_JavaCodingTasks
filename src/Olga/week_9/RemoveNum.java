package Olga.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNum {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 5, 105, 203, 34, 72, 81, 300,2, 100,99));
        list.removeIf(l-> l >= 100);
        for (Integer l : list){
            System.out.println(l);
        }
    }
}
