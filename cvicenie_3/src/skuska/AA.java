package skuska;

public class AA {
//    AA() {
//        Abc a = new skuska.Abc();
//        skuska.Abc.cau();
//    }
//    private void peto() {
//
//    }
    public static void main(String[] args) {
        System.out.println(new Clovek("Adam", "Prvy"));
    }
}

class Clovek {
    String meno, priezvisko;
    Clovek(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
    }
    public String toString() {
        return meno + " " + priezvisko;
    }
    void vypis() {
        System.out.println(priezvisko + " " + meno);
    }
}
class Student extends Clovek {
    int rocnik;
    Student(String meno, String priezvisko, int
            rocnik) {
        super(meno, priezvisko);
        this.rocnik = rocnik;
    }
    public String toString() {
        return priezvisko + " " + meno;
    }
    void vypis() {
        System.out.println(meno + " " + priezvisko);
    }
}