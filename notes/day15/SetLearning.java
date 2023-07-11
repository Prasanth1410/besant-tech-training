package Day15;

import java.util.HashSet;

public class SetLearning {
	
	// Set - Interface from collection interface 
	
	// Which will not allow you duplicate values 
	
	// Duplicates values are ignored at the compilation or ignored 
	
	// Set interface is implemeted in the following classes 
	
	// Hashset [ Class ]
	
	// Linked Hash Set [ Class]

	public static void main(String[] args) {

		HashSet<String> languages = new HashSet<String>();
		languages.add("Java");
		languages.add("English");
		languages.add("Tamil");
		languages.add("Hindi");
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");


		//  Hashset 
		
		//  It will allow to save duplicates but it wil be ignored at the time of compilation
		//  Insertion order is not maintained 
		//  THERE WLL BE NO GET METHOD IT DOES NOT MAINTAIN INSERTION ORDER
		
		for(String e : languages) {
			System.out.println(e);
		}
		
		System.out.println(languages.size());
		
		System.out.println(languages.contains("Java"));


		System.out.println(languages.remove("Python"));

		System.out.println(languages.size());


	}

}
