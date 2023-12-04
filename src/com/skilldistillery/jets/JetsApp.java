package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.Scanner;
//Story1
public class JetsApp {
	
	public AirField airField;
		
		
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		JetsApp launch = new JetsApp();
		AirField airField1 = new AirField();
		airField1.addJetList();
		
		// Greeting
		System.out.println("Hello! Welcome to the Jet App");
		//Story3
		launch.displayMenu(userInput);
		
	}
	
	//Story 4
	public void displayMenu(Scanner userInput) {
		
		int userChoice = 0;
		
		while(userChoice != 9) {
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
			userChoice = userInput.nextInt();
			userInteraction(userChoice);
		}
		
	}
	
	public void userInteraction(int userinput) {
		
		switch (userinput) {
		case 1:
			displayJets(airField.jets);
			break;
		case 2:
			System.out.println("Flying all Jets!");
			break;
		case 3: 
			System.out.println("The fastest Jet on record is: ");
			break;
		case 4:
			System.out.println("The jet with the longest range is:");
			break;
		case 5:
			System.out.println("");
			break;
		case 6:
			System.out.println("Plasma Cannons loaded!");
			break;
		case 7:
			System.out.println("Which jet would you like to remove?");
			break;
		case 8:
			System.out.println("Enter the details for the jet you would like to add: ");
			break;
		case 9:
			System.out.println("Have a wonderful day!");
			break;
		default: 
			System.out.println("Please enter a valid number.");
			break;
		}
		
	}
	
	public void displayJets(ArrayList<Jet> jets) {
		for(Jet jet : jets ) {
			if(jet != null) {
				System.out.println(jet);
			}
		}	
	}
	
	

}
