package Lab14;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapIterationExample {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // Adding key-value pairs to the linked hash map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        System.out.println("Linked Hash Map: ");

        // Iterating and printing the nodes of the linked hash map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
