package Day5;

public class RunnerCls {

	
	public void addit()  // Method declaration 
	
	// Method Body
	{
		int x = 15 ;
		
		int y = 25 ;
		
		int z = x + y ;
		
		System.out.println(z);
	}

	// OOPS - Object Oriented Programming structured language 
	
	// Class - A place where we wil write our codes  // It is blueprint of methods and objects 
	
	// Methods -- Actions or a Function that needs to be performed by a porgramm is known as methods 
	
	// Objects --  Is dependant on class name and main method
	        // It is used to call the methods inside the class
	
	public static void main(String[] args) {
		
		
		
		// To access methods we need to create objects 
		
		MethodsLearning ml1 = new MethodsLearning();
		ml1.addit();
		
		System.out.println("**************************************");
		
		RunnerCls ra =new RunnerCls();
		ra.addit();
	}

}
