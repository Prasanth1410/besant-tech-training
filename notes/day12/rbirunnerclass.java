package Day12;

public class rbirunnerclass {

	public static void main(String[] args) {
		
		
		HDFC h = new HDFC();
		
		h.setdetails();
		System.out.println("*************************************************");
		SBI s = new SBI();
		
		s.setsbidetails();
		System.out.println("*************************************************");

		CANARA c = new CANARA();
		c.setcanaradetails();

	}

}
