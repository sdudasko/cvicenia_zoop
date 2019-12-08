public class T {
    int dlzka, sirka, vyska, meno;

    public T(int dlzka, int sirka, int vyska, int meno) {
        this.dlzka = dlzka;
        this.sirka = sirka;
        this.vyska = vyska;
        this.meno = meno;
    }
    T() {
        this(1,1,1,1);
    }
    public T(T t) {

    }
}
