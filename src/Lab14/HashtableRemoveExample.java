package Lab14;

import java.util.Hashtable;

public class HashtableRemoveExample {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();

        // Adding key-value pairs to the hashtable
        table.put("Apple", 1);
        table.put("Banana", 2);
        table.put("Cherry", 3);

        System.out.println("Hashtable before removing: " + table);

        // Removing a key-value pair from the hashtable
        table.remove("Banana");

        System.out.println("Hashtable after removing: " + table);
    }
}
