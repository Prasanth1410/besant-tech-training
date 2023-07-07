package Day12;

public class AccessModifiers {
	
	//  Public - Publically it is avaiable everywhere
	
	// Access modifiers Can be used in data type / methods 
	
	// Default  - Without any access modifers that methods are said be as feault access modiers methods
	
	//  This can be used inside the package, we cant use this outside the package 
	
	// Protected - Protected and default access mofiders are same 
	
	// it can be used inside the package cannot be used outside the package
	
	// Final - we can just view where ever we want we cant overide or replace data types or methods 
	
	
	//  Private - Is a separate topic which we will be seeing encapsulation 
	
	void add ()
	{
		int a = 10 ;
		int b = 20 ;
		int c = a +b ;
		System.out.println(c);
	}
	
	public void sum()
	{
		int a = 10 ;
		int b = 20 ;
		int c = a - b ;
		System.out.println(c);
	}
	
	protected void div()
	{
		int a = 10 ;
		int b = 20 ;
		int c = a / b ;
		System.out.println(c);
	}
	
	int a = 20 ;
	
	final int  b = 20 ;
	
	

}
