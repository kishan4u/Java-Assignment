package Assignment4;

import java.util.HashMap;

public class ContainsKey {
  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "one");
    map.put(2, "two");
    map.put(3, "three");
    map.put(4, "four");
    int key = 3;
    if (map.containsKey(key)) {
      System.out.println("The key " + key + " exists in the HashMap with value: " + map.get(key));
    } else {
      System.out.println("The key " + key + " does not exist in the HashMap.");
    }
  }
}
