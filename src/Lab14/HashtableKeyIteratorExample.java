package Lab14;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableKeyIteratorExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();

        // Adding key-value pairs to the hashtable
        table.put("Apple", 1);
        table.put("Banana", 2);
        table.put("Cherry", 3);

        // Iterating through the keys of the hashtable
        Enumeration<String> keys = table.keys();
        System.out.println("Keys of the hashtable: ");
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
    }
}
