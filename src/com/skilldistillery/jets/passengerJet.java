package com.skilldistillery.jets;

public class passengerJet extends Jet {
	
	public static void main(String[] args) {
		
		passengerJet launch = new passengerJet();
		launch.fly();
		
	}

	public void createPassenger() {
		
	
	}
	
	public void fly() {
		
		String model = ("Alpha");
		Double range = 9000.5;
		int speed = 15000;
		long price = 95867345;
		
		System.out.println(model);
		System.out.println(range);
		System.out.println(speed);
		System.out.println(price);

	}
	
}
