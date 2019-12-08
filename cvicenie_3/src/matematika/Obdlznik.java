package matematika;

public class Obdlznik extends Matematika {
    public Obdlznik(double a, double b) {
        super(a, b);
    }
    public double obvod() {
        return 2 * (this.a + this.b);
    }
    public double obsah() {
        return this.a * this.b;
    }
}
