package Day15;

import java.util.LinkedList;

public class LinkesList {

	public static void main(String[] args) {

		// List is Interface which Implements to the following class 
		
		//  Array List 
		
		 // Linked List 
		
		//  Linked List - To increase the performance by using data structures conecpts 
		
		//  The retrieving speed of Linked list using index is sppeder than in array list which is in mili seconds 
		
		// Linked list also works on basis of indexing 
		
		
		LinkedList<String> names = new LinkedList<String>();
		names.add("Chaitra");
		names.add("Jyoti");
		names.add("Murnali");
		names.add("Prsaanth");
		names.add("Sarath");
		names.add("Sham");
		names.add("Sinhu");
		names.add("Vidhya");
		names.add("Zenith");
		names.add("Arjun") ;
		names.add("Jyoti") ;
		
		
		
		// Size 
		
		System.out.println(names.size());
		
		// Remove using object 
		
		System.out.println(names.remove("Arjun"));
		
		// Size 
		
		System.out.println(names.size());
		
		
		for(String a : names) {
			System.out.println(a);
		}
		
		LinkedList<Object> alldatyp = new LinkedList<Object>();
		
		alldatyp.add(1);
		alldatyp.add("Strings added");
		alldatyp.add('c');
		alldatyp.add(7.9);
		alldatyp.add(true);
		
		for(Object o : alldatyp)
		{
			System.out.println(o);
		}
		
		
		
		
	}

}
