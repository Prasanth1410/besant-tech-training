package Day18;

public class ThrowVsThrows {
	
	// Throw : Throw is a user defined Exceptions , We can continue the executions 
	
	// Throws : Throws is a exection throwned by ur JAVA, We cant continue to execution 

	public static void main(String[] args) {
		
		
		// Accesing Enum 
		
		for(Daysinaweek d : Daysinaweek.values())
		{
			System.out.println("The days in a weeks are " + d);
		}
		
	}

}
