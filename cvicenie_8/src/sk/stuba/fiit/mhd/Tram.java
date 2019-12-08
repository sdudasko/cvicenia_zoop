package sk.stuba.fiit.mhd;

import java.util.ArrayList;

import sk.stuba.fiit.vztahy.Clovek;

public class Tram {
	TramStop baseStation;
	private double speed;
	private int max;
	int actualNumOfPassengers;
	
	ArrayList<Clovek> passengers = new ArrayList<Clovek>();

	public Tram(TramStop baseStation) {
		this.baseStation = baseStation;
	}

	public void moveNextTramStop() {
		System.out.println("...presuvam sa na dalsiu zastavku.");
		this.speed = 60;

	}

	public void stop() {
		System.out.println("zastavujem...");
		this.speed = 0;
	}

	public void openTheDoor() {
		System.out.println("som elektricka a otvaram dvere...");
	}

	public void closeTheDoor() {
		System.out.println("som elektricka a zatvaram dvere...");
	}
	
	public void getIn(Clovek c) {
		actualNumOfPassengers++;
		passengers.add(c);
	}
	
	public void getIn(ArrayList<Clovek> c) {
		actualNumOfPassengers += c.size();

	}
	
	public void getOff(ArrayList<Clovek> c) {
		actualNumOfPassengers -= c.size();

	}
}
