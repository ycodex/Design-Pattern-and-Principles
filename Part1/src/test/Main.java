package test;

public class Main {
	public static void main(String[] args) {
		OrderImplement o=new OrderImplement();
		o.processOrder("Pixel");
		RepairImplement r=new RepairImplement();
		r.processPhoneRepair("Iphone");
		AccessoryImplement a=new AccessoryImplement();
		a.processAccessoryRepair("Samsung");
	}
}
