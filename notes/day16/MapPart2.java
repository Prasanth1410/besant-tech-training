package Day16;

import java.util.LinkedHashMap;

public class MapPart2 {

	public static void main(String[] args) {
	
		// Linked HashMap - It uses data structur concpets 
		
				// It save in ordered list
				// Keys will not allow u to save duplicates
				// Values will allow u to save duplicates
		
		LinkedHashMap<String, Integer> empdetails = new LinkedHashMap<String, Integer>();
		empdetails.put("Navin", 101);
		empdetails.put("Nivaan", 102);
		empdetails.put("Sindhu", 103);
		empdetails.put("Mrunali", 104);
		empdetails.put("Vishya", 105);
		
		System.out.println(empdetails.size());
		
		empdetails.replace("Nivaan", 102, 100);
		
		for(String c : empdetails.keySet())
		{
			System.out.println("The Emp Name is " +c + " and the id no is " +empdetails.get(c));
		}

	}

}
