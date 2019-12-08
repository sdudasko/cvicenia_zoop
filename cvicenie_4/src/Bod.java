public class Bod {
    public int x, y, z;

    public Bod(int x, int y, int z) {
        if (x < 50)
            this.x = x;
        if (y < 50)
            this.y = y;
        if (z < 50)
            this.z = z;
    }
    public Bod() {
        this.x = 1;
        this.y = 2;
        this.z = 3;
    }
}
