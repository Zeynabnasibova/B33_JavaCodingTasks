package mentor.week11;

import java.util.Map;

public class MapMinValue {
    //Write a method that can return the minimum value from a map (DO NOT use sort method)

    public static void main(String[] args) {
        Map<String, Integer> sampleMap = Map.of(
                "a", 10,
                "b", 5,
                "c", 15,
                "d", 3,
                "e", 8
        );

        System.out.println("Minimum value in the map is: " + getMinValue(sampleMap));
    }
    public static <K, V extends Comparable<V>> V getMinValue(Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Map cannot be null or empty");
        }

        V minValue = null;

        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (minValue == null || entry.getValue().compareTo(minValue) < 0) {
                minValue = entry.getValue();
            }
        }

        return minValue;
    }


}
