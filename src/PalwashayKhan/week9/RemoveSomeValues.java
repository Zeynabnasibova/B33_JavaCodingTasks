package PalwashayKhan.week9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveSomeValues {

    public static void main(String[] args) {
        //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
        // Example usage
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 150; i++) {
            numbers.add(i);
        }

        System.out.println("Original list: " + numbers);

        removeValuesGreaterThan100(numbers);

        System.out.println("Modified list: " + numbers);
    }


        public static void removeValuesGreaterThan100(List<Integer> numbers) {
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() > 100) {
                    iterator.remove();
                }
            }
        }
    }

/*
    The removeValuesGreaterThan100 method takes a List<Integer> as a parameter.
    It uses an Iterator to traverse the list.
    While iterating, it checks if the current element is greater than 100. If so,
     it removes the element using the iterator.remove() method.
    The main method demonstrates how to use this function with a sample list of
     integers from 1 to 150.
    The program prints the original list and the modified list after removing
    values greater than 100.
 */