package Day18;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionVSCollections {
	
	// Collection : Is an interface 
	
	// Collections : It is an Class which comes from JAVA which has inbuild methods 

	// Assignment :
	
	// Arraylist which is an Integer, dont add any numbers 
	// Using for loop you have to add numbers from 0 to 15 in the created array list 
	// Print the array list in descending order using for loop , Collections 
	
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(99);
		marks.add(80);
		marks.add(100);
		marks.add(89);
		marks.add(99);
		marks.add(67);
		
		for(Integer e :marks )
		{
			System.out.println("The Marks scored is " +e);
		}
		
		System.out.println("*************************************************");
		
		// Traditional Loop
		
		// Intilization int i = marks.siez()-1
		// i>=0 ;
		// i--
		
		for( int i = marks.size()-1 ; i >= 0 ; i--)
		{
			System.out.println(marks.get(i));
		}
		
		System.out.println("*************************************************");
		
		for(Integer e :marks )
		{
			System.out.println("The Marks scored is " +e);
		}

		System.out.println("*************************************************");
		
		// Collections is a class which is having methods 
		
		Collections.reverse(marks);
		
		for(Integer e :marks )
		{
			System.out.println("The Marks scored is " +e);
		}
		
	
	}

}
