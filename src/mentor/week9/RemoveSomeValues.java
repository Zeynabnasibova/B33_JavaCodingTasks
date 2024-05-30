package mentor.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {

//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {
        System.out.println(remove1(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 101, 200, 300))));
        System.out.println(remove2(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 101, 200, 300))));
    }

    public static List<Integer> remove1(List<Integer> list) {
        ArrayList<Integer> listUpdated = new ArrayList<>();
        for (int each : list)
            if (each <= 100)
                listUpdated.add(each);
        list = listUpdated;
        return list;
    }

    //solution2
    public static List<Integer> remove2(List<Integer> list) {
        list.removeIf(number -> number > 100);
        return list;
    }

}