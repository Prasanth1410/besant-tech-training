package Day12;

public class RunnerClass {

	public static void main(String[] args) {
		MethodOverdiding mo = new MethodOverdiding();
		mo.add();
		mo.sub();
		
		AccessModifiers am = new AccessModifiers(); 
		am.add();
		am.sum();
		am.div();
		
		System.out.println(am.a);
		am.a = 40 ;
		System.out.println("After overiding");
		System.out.println(am.a);
		System.out.println(am.b);
		
		 // am.b = 50 ;
	}

}
