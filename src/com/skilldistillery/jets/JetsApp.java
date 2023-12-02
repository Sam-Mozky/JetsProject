package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {
	
	private AirField airField;
	 // call other methods here
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		JetsApp launch = new JetsApp();
		
		// Greeting
		System.out.println("Hello! Welcome to the Jet App");
		launch.displayMenu();
		
	}
	
	//Story 4
	public void displayMenu() {
		
		System.out.println("Please enter the number corresponding with your selection: ");
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View the fastest jet");
		System.out.println("4. View Jet with the longest range");
		System.out.println("5. Prepare the BEAMS");
		System.out.println("6. Load Plasma Cannons");
		System.out.println("7. Add a Jet to Fleet");
		System.out.println("8. Remove a Jet from Fleet");
		System.out.println("9. Quit");
		
	}
	
	

}
