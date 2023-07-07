package Day11;

public class PolymorphismPart1 {
	
	// Poly - One to many 

	// Polymorphism is divided into two types 
	
	// 1 Method Overloading 
	
	// 2 Method Overriding 
	
	//  Method Overloading 
	
	public void add(int a , int b)
	{
		int c = a + b;
		System.out.println(c);
	}
	
	// Method Overloading - Methods with same name but different arguments are said to be as method overlaoding 
	
	// Method overlaoding is also known as Static polymorphism or Compile time polymorphsm
	
	public void add(int a,int b ,int c)
	{
		int d = a+b+c ;
		System.out.println(d);
	}
	
	public void add(int a,int b ,int c,int d)
	{
		int e = a+b+c+d;
		System.out.println(e);
	}
	
	

	public void add(int a,int b ,int c,int d,int e)
	{
		int f = a+b+c+d+e;
		System.out.println(f);
	}
	
	
	
	

}
