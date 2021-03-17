
public class AudiFactory extends Factory{

	@Override
	Headlight makeHeadlight() {
		Headlight h=new AudiHeadlight();
		return h;
	}

	@Override
	Tire makeTire() {
		Tire t=new AudiTire();
		return t;
	}

}
