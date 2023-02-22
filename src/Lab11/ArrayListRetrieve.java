package Lab11;

import java.util.ArrayList;

public class ArrayListRetrieve {

	public static void main(String[] args) {
		
		
		ArrayList<String> Array = new ArrayList<String>();
		
		Array.add("Kishan");
		Array.add("Tomar");
		Array.add("Aman");
		Array.add("Arun");
		Array.add("Aushutosh");
		
		System.out.println(Array);
		
		System.out.println("Retrieve the second element "  + Array.get(1));
		
		
		

	}

}
