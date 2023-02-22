package Lab12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorForwardBackward {

	public static void main(String[] args) {
	
       ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Geeta");
		list1.add("Bible");
		list1.add("Quran");
		list1.add("Buddhist");
		list1.add("Jainism");
		
		
		ListIterator < String > names = list1.listIterator();
		
		
		while(names.hasNext()) {
			
		System.out.println(names.next());      //Using for each loop
		
	}
		System.out.println("List in backward direction");
		
		while(names.hasPrevious()) {
			
			System.out.println(names.previous());    //Using for each loop
		
	}

}}
