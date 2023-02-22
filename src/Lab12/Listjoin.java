package Lab12;

import java.util.ArrayList;
import java.util.List;

public class Listjoin {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Kishan");
		list1.add("Tomar");
		list1.add("Kunal");
		list1.add("Rajput");
		list1.add("Kshtriya");
		
List<String> list2 = new ArrayList<String>();
		
		list2.add("Anshul");
		list2.add("Sikarwar");
		list2.add("Mukesh");
		list2.add("Jitendra");
		list2.add("Rajeev");
		
		System.out.println(" List1 and List2 are ");
		
		System.out.println(list1);
		System.out.println(list2);
		
		System.out.println(" Merging list below ");
		
		List<String> list3 = new ArrayList<String>(list1);
		
		list3.addAll(list2);         // Merging into new into new list
		
		System.out.println(list3);
		
		list1.addAll(list2);
		
		System.out.println(list1);   //Merging into existing list
		
		
	}

}
