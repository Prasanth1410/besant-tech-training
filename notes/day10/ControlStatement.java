package Day10;

public class ControlStatement {

	public static void main(String[] args) {

		/*
		 * if() {
		 * 
		 * } else if() {
		 * 
		 * } else if() {
		 * 
		 * } else if() {
		 * 
		 * } else {
		 * 
		 * }
		 */
		
		int Chem = 189 ;
		int phy  = 200 ;
		int bio = 200 ;
		int comp = 200 ; 
		int maths = 199 ;
		
		int mbbs = bio + phy + Chem ;
		int be = Chem + phy  +maths ;
		
		if(mbbs == 600)
		{
			System.out.println("Selcted for MBBS");
		}
		
		else if(be == 600)
		{
			System.out.println("Selected for top level Eng Clg");
		}
		else
		{
			System.out.println("Selected for Normal Enginering clg");
		}
		
	}

}
