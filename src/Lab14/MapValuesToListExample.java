package Lab14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapValuesToListExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Converting values of the map to a list
        List<Integer> list = new ArrayList<>(map.values());

        System.out.println("Values of the map: " + list);
    }
}
