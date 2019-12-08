public class Cau {
    protected int i;
    public Cau() {}
    public Cau(int i) {
        System.out.println("Toto je A");
    }
    public void m() {
        System.out.println("metoda m");
    }
    public void m(int i) {
        System.out.println("iná metoda m");
    }
}
class B extends Cau {
    public final void m() {
        super.m();
        super.i++;
        System.out.println("metoda m triedy B");
    }
}