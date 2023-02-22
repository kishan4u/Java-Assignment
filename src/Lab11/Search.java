package Lab11;

import java.util.ArrayList;

public class Search {

	public static void main(String[] args) {
		
ArrayList<String> Array = new ArrayList<String>();
		
		Array.add("Kishan");
		Array.add("Tomar");
		Array.add("Aman");
		Array.add("Arun");
		Array.add("Aushutosh");
		
		System.out.println(Array);
		
		for (String match: Array) {
			
			if(match.contains("Aman"))
				System.out.println(match);
		}

	}

}
