package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {
	
	public ArrayList<Jet> jets = new ArrayList<>();
	
//	public AirField(ArrayList<Jet> jets) {
//		super();
//		this.jets = jets;
//	}
	
	public void addJetList() {
	Jet voyager = new passengerJet("OM95", 90000.5, 15000, 95867345);
	Jet enterprise1 = new explorerJet("OG50", 90001.8, 15500, 123445693);
	Jet enterprise2 = new explorerJet("OG50", 90001.8, 15500, 123445693);
	Jet klingon1 = new fighterJet("K19c4", 80002.3, 14003, 12000034); //(model, speed, price, range)
	Jet klingon2 = new fighterJet("K19c4", 80002.3, 14003, 12000034); //(model, speed, price, range)

	jets.add(voyager); //passenger
	jets.add(enterprise1); //explorer
	jets.add(enterprise2); 
	jets.add(klingon1); //fighter
	jets.add(klingon2);
	
	for(Jet jetName : jets) {
		System.out.println(jetName);
	}
	
	
	
	}

//	public ArrayList<Jet> getJets() {
//		return jets;
//	}
//
//	public void setJets(ArrayList<Jet> jets) {
//		this.jets = jets;
//	}
	
}
