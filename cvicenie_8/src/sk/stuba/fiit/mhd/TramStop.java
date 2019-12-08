package sk.stuba.fiit.mhd;

public class TramStop {
	Poloha p;
	String name;
	Boolean onRequest = true;
	
	public TramStop(String name) {
		super();
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
}
