package Day14;

public class LopicalOpWorking {

	public static void main(String[] args) {
		
		
		int a = 10 ;
		int b = 20 ;
		int c = 30 ;
		
		
		// * Condtion 1 - To verify a < b and b > c [ Any 1 is true cond 1 is satfied ]
					// Contion 1 Sataisfied 
		
		// Condtion 2 - To verify a < b and c > b [ Both satttement should be true]
					// Condtion 2 satisfied 
		
		// 	T && F  = F
		if(a<b && b>c  ) // F
		{
			System.out.println("Condtion 1 satisfied");
		}
			// 	T || F = T 
		else if(a<b  || c<b)
		{
			System.out.println("Condtion 2 satisfied");
		}
		else
		{
			System.out.println("Nothing is true");
		}
		
		

	}

}
