package Lab14;

import java.util.HashMap;
import java.util.Map;

public class HashMapContainsKeyExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Checking if a key exists in the map
        boolean exists = map.containsKey("Banana");
        if (exists) {
            System.out.println("Key exists in the HashMap");
        } else {
            System.out.println("Key does not exist in the HashMap");
        }
    }
}
