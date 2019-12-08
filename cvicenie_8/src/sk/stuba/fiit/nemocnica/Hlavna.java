package sk.stuba.fiit.nemocnica;

public class Hlavna {

	public static void main(String[] args) {
		Lekar primarFero = new Lekar("Fero", "Maly", 33, 189);
		Lekar sekundarJano = new Lekar("Jano", "Sekundarny", 24, 19);
		Sestricka hlavnaVierka = new Sestricka("Vierka", "Nova", 19, 2);
		Sestricka pomocnaJanka = new Sestricka("Jana", "Novotna", 19, 2);
		Sestricka vedlajsiaDanka = new Sestricka("Dana", "Majova", 19, 2);
		
		Operacia apendix = new Operacia(primarFero, sekundarJano, hlavnaVierka, pomocnaJanka, vedlajsiaDanka);
		apendix.vypis(); 
		
		Appendix oa = new Appendix(primarFero, sekundarJano, hlavnaVierka, pomocnaJanka, vedlajsiaDanka);
		
		
		Operacia o = new Operacia(sekundarJano, pomocnaJanka);
		//o.vypis();

	}

}
