package Lab11;

import java.util.ArrayList;

public class Replace {

	public static void main(String[] args) {
		

		ArrayList<String> Array = new ArrayList<String>();
		
		Array.add("Kishan");
		Array.add("Tomar");
		Array.add("Aman");
		Array.add("Arun");
		Array.add("Aushutosh");
		
		System.out.println(Array);
		
		System.out.println("Replace the array element" + Array.set(4, "Tomar"));

		System.out.println(Array);
		
		
	}

}
