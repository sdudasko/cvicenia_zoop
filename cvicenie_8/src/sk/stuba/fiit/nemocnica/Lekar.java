package sk.stuba.fiit.nemocnica;

public class Lekar {
	String meno;
	String priezvisko;
	int vek;
	int pocetUspesnychOperacii;

	public Lekar(String meno, String priezvisko, int vek, int pocetOperacii) {
		super();
		this.meno = meno;
		this.priezvisko = priezvisko;
		this.vek = vek;
		this.pocetUspesnychOperacii = pocetOperacii;
	}

}
