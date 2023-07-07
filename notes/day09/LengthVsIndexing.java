package Day9;

public class LengthVsIndexing {

	public static void main(String[] args) {
		
		// What is length ??
		// Total number of charcter in a string 
		// It will start from 1
		
		//What is indexing ??
		// Length - 1 
		//  It will start from 0 
		
		
		String s = "This is the java class       " ;
			//		12345678901234567890123456789
		System.out.println(s.length());
		
		String s3 = "This is the java class       " ;
		 // 		 01234567890123456789012345678	
		
		String s1 = "Navin" ;
		String s9 = "navin" ;
		
	String newstring  =s1.concat(s9) ;
	
	System.out.println(newstring);
		
		Boolean y = s1.equals(s9) ;
		Boolean n = s1.equalsIgnoreCase(s9);
		
		
		
		System.out.println(n);
		
		char o = s3.charAt(21) ;
		System.out.println(o);
		
		// 03-07-2023
		
		String date = "03-07-2023" ;
		
		System.out.println(date);
		
		// 03/07/2023
		
		String update = date.replace('-', '/');
		
		System.out.println(update);
		 
		
//		String s3 = "This is the java class       " ;
		 // 		 01234567890123456789012345678	
		
		
		//  Subsbtring 
		String whichclass = s3.substring(12, 16) ;
		
		System.out.println(whichclass);
		
		String anothersubstring = s3.substring(12) ;
		System.out.println(anothersubstring);
		
		
		
		Boolean conta = s3.contains("java") ;
		System.out.println(conta);
		

	}

}
