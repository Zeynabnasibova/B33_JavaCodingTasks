package Mikhail.week11;

import java.util.HashMap;
import java.util.Map;

public class MapMinValue {
    public static void main(String[] args) {
        //Write a method that can return the minimum value from a map (DO NOT use sort method)
        Map<Character, Integer> testMap = new HashMap<>();
        testMap.put('A',5);
        testMap.put('c',2);
        testMap.put('B',6);
        testMap.put('e',3);
        testMap.put('f',7);
        System.out.println(minValue(testMap));

    }

    public static int minValue (Map<Character,Integer>testMap){
        int tempValue= testMap.values().iterator().next();
        for (Character c : testMap.keySet()) {
          if (tempValue > testMap.get(c)) {
              tempValue = testMap.get(c);
          }
        }
        return tempValue;
    }
}


