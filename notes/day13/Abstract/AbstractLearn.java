package Day13;

public abstract class AbstractLearn {
	

	// Multiple inheritance is not allowed in java 
	
	// Abstarction - Starting approach to fix multiple inheritance was abstraction 
	
	// Set of rules which needs to be followed 
	
	// 100 % Multiple inhertance is not achieved in abstarction concept
	
	// It allows non abtsarct methods as well 
	
	// For creating abstract class or methods abstract keyword is important is needed 
	
	// for abstarct methods it will not allow you to write implementation 

	// We cant create object for abstarct class and interface 
	
	//  Non abstract methods 
	
	public void display ()
	{
		System.out.println("Display Numbers 1234567810");
	}
	
	public abstract void add();
	public abstract void sum();
	public abstract void div();
	


}
