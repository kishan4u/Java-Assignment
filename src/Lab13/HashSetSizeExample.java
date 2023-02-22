package Lab13;

import java.util.HashSet;
import java.util.Set;

public class HashSetSizeExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

        // Adding elements to the set
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Getting the size of the set
        int size = set.size();

        System.out.println("Size of the HashSet: " + size);

	}

}
