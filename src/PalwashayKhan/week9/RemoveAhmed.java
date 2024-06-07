package PalwashayKhan.week9;

import java.util.ArrayList;
import java.util.List;

public class RemoveAhmed {
    public static void main(String[] args) {
        /*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/

        //Create an array list
        List<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("John");
        names.add("Eric");
        names.add("Ahmed");
        names.add("Emily");
        names.add("Ahmed");

        // Print the list before removal
        System.out.println("Before removal: " + names);

        // The removeIf method takes a lambda expression name -> name.equals("Ahmed") which returns true for names equal to "Ahmed".
        //This effectively removes all instances of "Ahmed" from the list
        names.removeIf(name -> name.equals("Ahmed"));

        // Print the list after removal
        System.out.println("After removal: " + names);
    }

}
