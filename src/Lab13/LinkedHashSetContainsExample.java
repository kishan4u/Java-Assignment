package Lab13;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetContainsExample {

	public static void main(String[] args) {
	
		        Set<String> set = new LinkedHashSet<>();

		        // Adding elements to the set
		        set.add("Apple");
		        set.add("Banana");
		        set.add("Cherry");

		        // Checking if an element exists in the set
		        boolean exists = set.contains("Banana");
		        if (exists) {
		            System.out.println("Element exists in the LinkedHashSet");
		        } else {
		            System.out.println("Element does not exist in the LinkedHashSet");
		        }
		    }
		

	}


