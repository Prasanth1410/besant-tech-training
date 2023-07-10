package Day14;

import java.util.ArrayList;

public class ArrayListLearning {

	public static void main(String[] args) {
		
		String[] studnames = {"Navin" , "Jones" , "Sampath"} ;
		
		
		ArrayList<String> studnameb6 = new ArrayList<String>();
		studnameb6.add("Navin");
		studnameb6.add("Kumar");
		studnameb6.add("Sampath");
		studnameb6.add("Nivaan");
		studnameb6.add("Arjun");
		studnameb6.add("Shyam");
		
		// Array List will work on the basis of indexing 
		
		// Size
		System.out.println(studnameb6.size());
		
		// To retrive using index
		System.out.println(studnameb6.get(5));

		// To remove some objects using index
		System.out.println(studnameb6.remove(5));
		
		// Size
		System.out.println(studnameb6.size());
				
		//// To remove some objects using object name 
				
		System.out.println(studnameb6.remove("Arjun"));
		
		// Size
		System.out.println(studnameb6.size());
				
		// Contains 
		
		System.out.println(studnameb6.contains("NIvaan"));
				
		
		// Contains 
	
		System.out.println(studnameb6.contains("Nivaan"));
		
		
		for(String a : studnameb6) 
		{
			System.out.println(a);
		}
		
		ArrayList<Object> alldattype = new ArrayList<Object>();
		
		alldattype.add(123445) ;
		alldattype.add('c');
		alldattype.add("Stringadded");
		alldattype.add(5.9);
		
		for(Object o : alldattype)
		{
			System.out.println(o);
		}
		

	}

}
