package Day16;

import java.util.HashMap;

public class LinkedHashMap {

	public static void main(String[] args) {
		
		
		// Map is a interface which will store in key and value format 
		
		//  Map is Interface
		
		//  HashMap [Class]
		
		// Linked HashMap [Class]\
		
		// String -- //Integer
		
				// Social  - 80
				
				// Science  -90
				
				// Maths - 100
				
				// Hindi - 90
				
				// English -95
				
				// Tamil -90 

			
		//HashMap - It will not store in ordered list 
		// Keys will not allow u to save duplicates
		// Values will allow u to save duplicates
		
		HashMap<String, Integer> markdetails = new HashMap<String, Integer>();
		markdetails.put("Social", 80);
		markdetails.put("Science", 90);
		markdetails.put("Maths", 100);
		markdetails.put("HIndi", 90);
		markdetails.put("English", 95);
		markdetails.put("Tamil", 90);
		
		//  To print the size 
		System.out.println(markdetails.size());
		
		// We can get the values using get(keys) method
		System.out.println(markdetails.get("English"));
		
		// To replace 
		System.out.println(markdetails.replace("Tamil", 90, 85));
		
		for(String e : markdetails.keySet())
		{
			System.out.println("The Marks Scored in "+ e + " is "+ markdetails.get(e));
		}
		
		
		
		
		
	}

}
