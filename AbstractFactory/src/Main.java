
public class Main {
	public static void main(String[] args) {
		Factory md=new MercedesFactory();
		Factory ad=new AudiFactory();
		Headlight h=md.makeHeadlight();
		h.HeadlightBrand();
		Tire t=ad.makeTire();
		t.tireType();
	}
	
}
