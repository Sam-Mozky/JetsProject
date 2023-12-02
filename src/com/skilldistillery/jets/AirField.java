package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {
	private ArrayList<Jet> jets = new ArrayList<>();
	jets.add("USS Voyager"); //passenger
	jets.add("USS Enterprise"); //explorer
	jets.add("Klingon"); //fighter
	
	Jet voyager = new passengerJet();
	Jet enterprise = new explorerJet();
	Jet klingon = new fighterJet(); //(model, speed, price, range)

	
}
