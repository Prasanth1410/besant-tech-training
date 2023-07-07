package Day11SmartPhone;

public class RunnerSmartphone {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		a.calling();
		a.switchon();
		a.switchoff();
		a.text();
		a.Faceid();
		a.appstore();
		
		System.out.println("*****************************************");
		
		OnePlus o = new OnePlus();
		o.switchon();
		o.text();
		o.calling();
		o.torchon();
		o.superfastcharging();
		
		System.out.println("*****************************************");
		
		Redmi r = new Redmi();
		r.switchon();
		r.torchoff();
		r.torchon();
		r.text();
		r.heavymegapixelcamera();
		
		System.out.println("*****************************************");

		Samsung s = new Samsung();
		s.switchon();
		s.switchoff();
		s.text();
		s.calling();
		s.camera();

	}

}
