package com.skilldistillery.jets;

public class explorerJet extends Jet {
	
	public static void main(String[] args) {
		
		explorerJet launch = new explorerJet();
		launch.fly();
		
	}
	
	public void createExplorer() {
		
	}
	
	public void fly() {
		
		String model = ("Bravo");
		Double range = 9001.8;
		int speed = 15500;
		long price = 123345693;
		
		System.out.println(model);
		System.out.println(range);
		System.out.println(speed);
		System.out.println(price);

	}
}
