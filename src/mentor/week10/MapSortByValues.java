package mentor.week10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapSortByValues {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("k0", 0);
        map.put("k5", 5);
        map.put("k2", 2);
        map.put("k1", 1);
        map.put("k3", 3);

        for (String each : map.keySet()) {
            System.out.println("key: " + each + " value: " + map.get(each));
        }
        System.out.println("2nd "+ map);
        System.out.println("sortByValue(map) = " + sortByValue(map));

    }



    /*
        Write a method that can sort the map by values
     */

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;

    }

}
