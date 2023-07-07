package Day7;

import java.util.Scanner;

public class ScannerCls {
	
	public void addit()  // Method declaration 
	
	// Method Body
	{
		int x = 15 ; // Hard Coding 
		
		int y = 25 ;
		
		int z = x + y ;
		
		System.out.println(z);
	}

	public static void main(String[] args) {
		
		// Scanner is a class which is available in java 
		
		// Interact with methods by giving inputs throught console 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		
		int x = sc.nextInt(); 
		
		System.out.println("The Entered number is" +x);
		
		System.out.println("Enter the Second Number");
		
		int y = sc.nextInt(); 
		
		System.out.println("The Entered number is" +y);
		
		int z = x + y ;
		
		System.out.println("The addition value of this is" +z);
	}

}
