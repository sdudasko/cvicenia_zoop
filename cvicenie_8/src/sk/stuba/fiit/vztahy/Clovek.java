package sk.stuba.fiit.vztahy;

public class Clovek {
	Stolicka s;
	Domcek d;
	Mozog m;

	public Clovek() {
		this.m = new Mozog();
	}

	Clovek(Stolicka s) {
		this.s = s;
	}
	
	Clovek(Clovek c) {
		this.s = c.s;
		this.d = c.d;
		this.m = c.m;
	}

	public void postavDomcek() {
		d = new Domcek();
	}

	public Domcek darujDomcek() {
		return this.d;
	}

	public Mozog darujOrgan() {
		return this.m;
	}
	
	public double vypocitajDan() {
		return 0;
	}
	
	public double vypocitajDanZaOLO() {
		//...alg na vyp. dane		
		return 0;
	}
	

}
