package Day12;

public class PolyMorphismPart2 {

	
	//Method Overriding - Dyanamic polymporshim / Run time polymoprhism 
	
	public void add()
	{
		int a = 10 ;
		int b = 20 ;
		
		int c = a +b ;
		
		System.out.println(c);
	}

	// The addition of two numbers is c 
	
	//  By extending the class to the sub class and we can overidid the implementation 
	
	// By using overriding concept your code will give preference to the overidedn methods 
	
	public void sub()
	{
		int a = 10 ;
		int b = 20 ;
		
		int c = a -b ;
		
		System.out.println(c);
	}
}
