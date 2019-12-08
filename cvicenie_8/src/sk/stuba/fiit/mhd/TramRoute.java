package sk.stuba.fiit.mhd;

import java.util.ArrayList;

public class TramRoute {
		private ArrayList<TramStop> tr = new ArrayList<TramStop>();

		public TramRoute() {
			System.out.println("vytvoril som novu trasu");
		}
		
		public void addNewTramStop(TramStop ts) {
			tr.add(ts);
			System.out.println("priadal som novu zastavku");			
		}
		
		TramStop getBaseTramStop() {
			return tr.get(0);
		}
		
		public int getPocetZastavok() {
			return tr.size();
		}
}
