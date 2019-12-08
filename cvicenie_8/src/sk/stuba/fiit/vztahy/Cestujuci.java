package sk.stuba.fiit.vztahy;

public class Cestujuci extends Clovek {
    private boolean platnyCL;

    public Cestujuci() {
        this.platnyCL = Math.random() < 0.5;
    }

    public boolean isPlatnyCL() {
        return platnyCL;
    }

    public String toString () {
        return "Jozo";
    }
}
