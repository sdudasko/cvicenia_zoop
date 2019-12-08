import java.util.List;

public class Kniznica {
    private final List<Kniha> knihy;

    Kniznica(List<Kniha> knihy) {
        this.knihy = knihy;
    }

    public List<Kniha> getKnihy() {
        return knihy;
    }

}
