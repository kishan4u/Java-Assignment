package Assignment4;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MapToListExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        List<Integer> keys = new ArrayList<>(map.keySet());
        System.out.println("Converted List of Keys: " + keys);
    }
}

