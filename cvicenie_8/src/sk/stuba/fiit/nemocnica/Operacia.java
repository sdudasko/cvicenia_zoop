package sk.stuba.fiit.nemocnica;

public class Operacia {

	Lekar primar;
	Lekar sekundar;
	Sestricka hlavna, vedlajsia, pomocna;

	public Operacia(Lekar primar, Lekar sekundar, Sestricka hlavna, Sestricka vedlajsia, Sestricka pomocna) {
		super();
		this.primar = primar;
		this.sekundar = sekundar;
		this.hlavna = hlavna;
		this.vedlajsia = vedlajsia;
		this.pomocna = pomocna;
	}

	public Operacia(Lekar sekundar, Sestricka pomocna) {
		this.sekundar = sekundar;
		this.pomocna = pomocna;
	}
	
	void vypis() {
		System.out.println("Primar:" + primar.meno + " " + primar.priezvisko);
		System.out.println("Operacia v poradi c.:" + primar.pocetUspesnychOperacii);
		System.out.println("Sekundar:" + sekundar.meno + " " + sekundar.priezvisko);
		System.out.println("Operacia v poradi c.:" + sekundar.pocetUspesnychOperacii);
		System.out.println("Sestricka: " + hlavna.meno + " asistencia c.: " + hlavna.pocetAsistencii);
		System.out.println("Sestricka: " + vedlajsia.meno + " asistencia c.: " + vedlajsia.pocetAsistencii);
		System.out.println("Sestricka: " + pomocna.meno + " asistencia c.: " + pomocna.pocetAsistencii);
	}
}