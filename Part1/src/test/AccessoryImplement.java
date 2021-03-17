package test;

public class AccessoryImplement implements AccessoryRepair {

	@Override
	public void processAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType+" repair accepted");
		
	}

}
