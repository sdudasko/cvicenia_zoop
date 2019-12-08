public class O {
    public String meno;
    public int vek;
    static int instCount;

    O(String meno, int vek) {
        this.meno = meno;
        this.vek = vek;
        instCount++;
    }
    public void vypis() {
        System.out.println(meno + " " + vek);
    }

}
