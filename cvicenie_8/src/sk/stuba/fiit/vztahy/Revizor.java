package sk.stuba.fiit.vztahy;

public class Revizor extends Clovek {
    public void dispose() {

    }
    public void skontroluj (Cestujuci cestujuci)
    {
        if (cestujuci.isPlatnyCL()) {
            System.out.println(cestujuci + " nemal platny CL.");
        } else {
            System.out.println(cestujuci + " mal platny CL.");
        }
    }

}
