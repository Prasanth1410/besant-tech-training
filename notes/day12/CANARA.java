package Day12;

public class CANARA {
	
	public void setcanaradetails()
	{
		RBI r = new RBI();
		r.setAccountno(1010019292384L);
		r.setAddress("Chennai TamilNadu");
		r.setLoanno(190986);
		r.setPhno(9790299569L);
		
		
		System.out.println(r.getAccountno());
		System.out.println(r.getAddress());
		System.out.println(r.getLoanno());
		System.out.println(r.getPhno());
		
	}

}
