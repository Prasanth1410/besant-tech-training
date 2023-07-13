package Day17;

import java.util.Scanner;

public class ExecptionHandlingMethods {
	
	public void add()
	{
		
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("ENter Number a ");
			int a = s.nextInt();
			System.out.println("ENter Number b ");
			int b = s.nextInt();
			int c = a +b ;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("I will be executed in alll case");
		}
	
	}
	
	public void sub()
	{
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("ENter Number a ");
			int a = s.nextInt();
			System.out.println("ENter Number b ");
			int b = s.nextInt();
			int c = a - b ;
			System.out.println(c);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			System.out.println("I will be executed in alll case");
		}
		
	}

	public static void main(String[] args) {
		ExecptionHandlingMethods em = new ExecptionHandlingMethods();
		em.add();
		em.sub();
	}

}
