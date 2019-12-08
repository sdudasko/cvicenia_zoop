public class Clovek {
    public String meno;
    public int rokNarodenia;

    Clovek(String meno, int rokNarodenia) {
        this.meno = meno;
        this.rokNarodenia = rokNarodenia;
    }
    public void vypisInformacie() {
        System.out.println("Meno: " + this.meno + ", rok narodenia: " + this.rokNarodenia);
    }
}
