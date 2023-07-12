package Day16;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MapInterfaceLearing {

	public static void main(String[] args) {
		
		// String -- //Integer
		
		// Social  - 80
		
		// Science  -90
		
		// Maths - 100
		
		// Hindi - 90
		
		// English -95
		
		// Tamil -90 

		
		ArrayList<String> subj = new ArrayList<String>();
		subj.add("Social");
		subj.add("Science");
		subj.add("Maths");
		subj.add("Hindi");
		subj.add("English");
		subj.add("Tamil");
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(80);
		marks.add(90);
		marks.add(100);
		marks.add(90);
		marks.add(95);
		marks.add(90);
		
		// I need a output Saying that Marks scored in XXXXX is XX
		
		for(int i = 0 ; i<subj.size(); i++)
		{
			System.out.println("The Marks Scored in " +subj.get(i) + " is " +marks.get(i));
		}
		
	}

}
