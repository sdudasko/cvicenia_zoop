package sk.stuba.fiit.obdlznik;

public class Kvader extends Obdlznik {
	double hlbka;
	double uhloprieckaKvadra;

	public Kvader(double hlbka, double sirka, double vyska) {
		super(vyska, sirka);
		this.hlbka = hlbka;
	}

	public double dlzkaUhlopriecky() {
		double pom;

		pom = super.dlzkaUhloprecky();
		this.uhloprieckaKvadra = (pom * pom) + (hlbka * hlbka);
		return Math.sqrt(this.uhloprieckaKvadra);
	}
}
