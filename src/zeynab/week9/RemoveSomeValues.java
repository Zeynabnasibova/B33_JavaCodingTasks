package zeynab.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSomeValues {

//Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>(Arrays.asList(1, 200,2, 3,500, 4, 5, 6 ,900));

        for(int i = 0; i < number.size(); i++){

            if(number.get(i)>100){

                number.remove(number.get(i));
            }
        }
        System.out.println("number = " + number);

    }



}
