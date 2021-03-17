package test;

public class RepairImplement implements Repair{

	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println(modelName+" repair Accepted");
		
	}

}
