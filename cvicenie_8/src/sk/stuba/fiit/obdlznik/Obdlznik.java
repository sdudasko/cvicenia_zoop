package sk.stuba.fiit.obdlznik;

public class Obdlznik {
	private double vyska;
	private double sirka;

	public Obdlznik(double vyska, double sirka) {
		this.vyska = vyska;
		this.sirka = sirka;
	}

	public double dlzkaUhloprecky() {
		return Math.sqrt((sirka * sirka) + (vyska * vyska));
	}

	public double getSirka() {
		return sirka;
	}
}
