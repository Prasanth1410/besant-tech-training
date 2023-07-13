package Day17;

import java.util.Scanner;

public class Atmwhithdrwal {
	
	// Throw is said to be as user defined execption 
	// Throws is said to be a java execption - Which will not allow you to execute the program 
	
	int bal = 1000 ;
	
	public void debit()
	{
		System.out.println("Enter the amount to be Withdrawl");
		Scanner s = new Scanner(System.in);
		int with = s.nextInt();
		
		try
		{
			if(with > bal)
			{
				throw new InsufficientBalanceException();
			}
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e);
		}
	}

}
