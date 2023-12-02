package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {
	private ArrayList<Jet> jets = new ArrayList<>();
	
	public void addJetList() {
	Jet voyager = new passengerJet("OM95", 90000.5, 15000, 95867345);
	Jet enterprise = new explorerJet("OG50", 90001.8, 15500, 123445693);
	Jet klingon = new fighterJet("K19c4", 80002.3, 14003, 12000034); //(model, speed, price, range)

	jets.add(voyager); //passenger
	jets.add(enterprise); //explorer
	jets.add(klingon); //fighter
	
	}
}
