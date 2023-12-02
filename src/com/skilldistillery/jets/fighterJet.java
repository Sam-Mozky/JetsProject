package com.skilldistillery.jets;

public class fighterJet extends Jet {
	
	public static void main(String[] args) {
		
		fighterJet launch = new fighterJet();
		launch.fly();
	}

	public void createFighter() {
		
		
	}
	
	public void fly() {
		
		String model = ("Last to Blow up");
		Double range = 8002.3;
		int speed = 14003;
		long price = 12000034;
		
		System.out.println(model);
		System.out.println(range);
		System.out.println(speed);
		System.out.println(price);

		
	}
}
