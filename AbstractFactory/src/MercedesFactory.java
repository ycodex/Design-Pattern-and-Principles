
public class MercedesFactory extends Factory{

	@Override
	Headlight makeHeadlight() {
		Headlight h=new MercedesHeadlight();
		return h;
	}

	@Override
	Tire makeTire() {
		Tire t=new MercedesTire();
		return t;
	}

	
	

}
