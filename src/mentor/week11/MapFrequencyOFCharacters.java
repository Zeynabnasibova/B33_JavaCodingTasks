package mentor.week11;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapFrequencyOFCharacters {
  //  Write a method that prints the frequency of each character from a String.

    public static void FrequencyTest(String  str ) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character each : str.toCharArray()) {

            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }

        }

        System.out.println(map);

    }
}
