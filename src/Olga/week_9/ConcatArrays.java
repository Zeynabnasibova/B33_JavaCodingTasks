package Olga.week_9;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcatArrays {
    //Write a return method that can concate two arrays

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Hello", "Bay"));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("Java", "C#", "Pithon"));
        ArrayList<String> list3 = new ArrayList<String>(list1);
        list3.addAll(list2);
        for (String l: list3) {
            System.out.print(l+" ");
        }



    }
}
