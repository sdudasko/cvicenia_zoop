package sk.stuba.fiit.mhd;

import java.util.ArrayList;

import sk.stuba.fiit.vztahy.Cestujuci;
import sk.stuba.fiit.vztahy.Clovek;
import sk.stuba.fiit.vztahy.Revizor;
import sk.stuba.fiit.vztahy.Turista;

import javax.swing.*;

public class Dispatcher {
	private ArrayList<Tram> t = new ArrayList();

	public Dispatcher() {

		TramRoute linka3 = new TramRoute();

		linka3.addNewTramStop(new TramStop("Pekna cesta"));
		linka3.addNewTramStop(new TramStop("Male Krasnany"));
		linka3.addNewTramStop(new TramStop("Vozovna"));
		linka3.addNewTramStop(new TramStop("Vinohrady"));

		Tram t1 = new Tram(linka3.getBaseTramStop());

		t.add(t1);

		for (Tram dt : t) {
			System.out.println("v elektricke je :" + dt.actualNumOfPassengers + " passengers");
			dt.getIn(new Clovek());
			dt.getIn(new Turista());
			System.out.println("v elektricke je :" + dt.actualNumOfPassengers + " passengers");
			System.out.println(linka3.getPocetZastavok());
			Revizor revizor = new Revizor();
			Cestujuci cestujuci = new Cestujuci();
			System.out.println(revizor);

			revizor.dispose();

			System.out.println(revizor);
			revizor.skontroluj(cestujuci);
		}

	}

}
