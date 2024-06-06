package zeynab.week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAhmed {

/*Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
*/
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        
        for(int i = 0; i < names.size(); i++) {
            
            if(names.get(i).equals("Ahmed")){
                
                names.remove(i);
            }
            
        }

        System.out.println("names = " + names);
    }
}
