package Assignment4;

import java.util.Hashtable;
import java.util.Set;

public class GetSet {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("Key1", "Value1");
        hashtable.put("Key2", "Value2");
        hashtable.put("Key3", "Value3");
        hashtable.put("Key4", "Value4");
        hashtable.put("Key5", "Value5");

        // Get set view of keys from Hashtable
        Set<String> keys = hashtable.keySet();

        // Display the set view of keys from Hashtable
        System.out.println("Set view of keys from Hashtable: " + keys);
    }
}
