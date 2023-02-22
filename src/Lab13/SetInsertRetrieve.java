package Lab13;

import java.util.HashSet;
import java.util.Set;

public class SetInsertRetrieve {
    public static void main(String[] args) {
        // Create a Set
        Set<String> set = new HashSet<>();

        // Insert values into the Set
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Retrieve values from the Set
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
