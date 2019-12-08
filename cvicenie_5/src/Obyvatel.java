public class Obyvatel {
    public String meno;
    public int vyska, vaha;

    Obyvatel(String meno, int vyska, int vaha) {
        this.meno = meno;
        this.vyska = vyska;
        this.vaha = vaha;
    }

    public Obyvatel(Obyvatel obyvatel) {
        this.meno = obyvatel.meno;
        this.vyska = obyvatel.vyska;
        this.vaha = obyvatel.vaha;
    }
}
