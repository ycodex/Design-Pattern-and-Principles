package test;

public class OrderImplement implements Order{

	@Override
	public void processOrder(String modelName) {
		System.out.println(modelName+" order accepted");
		
	}
	
}
