package Lab12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMin {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(45);
		list.add(15);
		list.add(5);
		list.add(20);
		list.add(25);
		
		System.out.println("Maximum value in list is " + Collections.max(list));
		
		System.out.println("Minimum value in list is " + Collections.min(list));

	}

}
