package Olga.week_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveName {
    /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/
    public static void main(String[] args) {
        List<String> names;
        names = new ArrayList<String>(Arrays.asList("Ahmed", "John", "Ahmed", "Eric", "Wick"));
//        names.add("Ahmed");
//        names.add("John");
//        names.add("Eric");
//        names.add("Ahmed");


        names.removeIf(name->name.equals("Ahmed"));
        for (String name : names) {
            System.out.println(name);
        }
    }

}
