public class Kvader {
    private int stranaA, stranaB, stranaC;
    public Kvader() {}
    public Kvader(int stranaA) { this.stranaA = stranaA; }
    public Kvader(int stranaA, int stranaB) { this.stranaA = stranaA; this.stranaB = stranaB; }

    public static void main(String[] args) {
        Kvader $k1 = new Kvader();
        Kvader $k2 = new Kvader(1);
        Kvader $k3 = new Kvader(1, 2);

        $k3.stranaA = 5;
        $k3.stranaB = 3;
    }

}
