package Day10;

public class Arrays {

	public static void main(String[] args) {
		
		
		String s1 = "Chaitra" ;
		String s2 = "Jyothi" ;
		String s3 = "Mrunali" ;
		String s4 = "Sindhuja" ;
		String s5 = "SreeVidhya";
		String s6 = "Vidhya" ;
		String s7 = "Prsanth" ;
		String s8 = "Shenba" ;
		String s9 = "Zenith";
		String s10 ="NavinSampath" ;
		
		int s1id = 101 ;
		int s2id = 102 ;
		int s3id = 103 ;
		int s4id = 104 ;
		int s5id = 105 ;
		int s6id = 106 ;
		int s7id = 107 ;
		int s8id = 108 ;
		int s9id = 109;
		int s10id = 110 ;


		/// My id is ** and My name is ** 
		
		System.out.println("My id is"+" " +s1id+" " +s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);
		
		
		System.out.println("First way of adding Strings names to array ");
		String [] studentnames = new String[20] ;
		studentnames[0] = "Chaitra" ;
		studentnames[1] = "Jyothi" ;
		studentnames[2] = "Mrunali" ;
		studentnames[3] = "Sindhuja" ;
		studentnames[4] = "SreeVidhya";

		System.out.println("Second way of adding Strings names to array ");
		String [] studentnames1 = {"Chaitra","Jyothi","Mrunali","Sindhuja","SreeVidhya" ,"Vidhya","Prsanth","Shenba", "Zenith" ,"NavinSampath"};
	
		System.out.println(studentnames.length);
		System.out.println(studentnames1.length);
		
		System.out.println(studentnames[4]);
		
		System.out.println(studentnames[15]);
		
		System.out.println(studentnames[0]);
		
		
		System.out.println(studentnames1[4]);
		System.out.println(studentnames1[9]);
		// Arrays will work on basis of index 
		// Once size is declared we cant increase or decrease the size 
	
	}

}
