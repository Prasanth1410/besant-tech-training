package Day15;

import java.util.LinkedHashSet;

public class LinkedHassetlearning {

	public static void main(String[] args) {
		
		//  Linkedhasset 
		
		// It will not allow duplicates
		//  It will maintain insertion order
		//  There will be no get (index) method 
		
		
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		
		names.add("Java");
		names.add("English");
		names.add("Navin");
		names.add("Java");
		names.add("Nivaa");
		names.add("Jones");
		names.add("Sampath");
		names.add("Maths");
		
		System.out.println(names.size());
		
		System.out.println(names.remove("English"));
		
		System.out.println(names.contains("Jones"));
		
		for(String s : names)
		{
			System.out.println(s);
		}

		
		
		
	}

}
