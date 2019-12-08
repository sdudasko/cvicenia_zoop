public class Cestujuci {
    public static int pocetVytvorenychInstancii = 0;

    public static int getPocetInstancii() {
        return pocetVytvorenychInstancii;
    }
    public Cestujuci() {
        pocetVytvorenychInstancii++;
    }
}
