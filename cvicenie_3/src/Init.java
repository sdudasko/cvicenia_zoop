import matematika.Matematika;
import matematika.Obdlznik;

import java.util.Arrays;

public class Init {
    private static int POCET_OBDLZNIKOV = 3;

    public static void main(String[] args) {

        KomplexneCislo $c1 = new KomplexneCislo(5, 2);

        PrivateConstruct $privateConstruct = PrivateConstruct.getInstance();

        double[] obvody = new double[POCET_OBDLZNIKOV];
        double[] obsahy = new double[POCET_OBDLZNIKOV];

        for (int i = 0; i < POCET_OBDLZNIKOV; i++) {
            Matematika $obdlznik = new Obdlznik(Math.random() * 50, Math.random() * 50);
            obvody[i] = $obdlznik.obvod();
            obsahy[i] = $obdlznik.obsah();
        }

        new SecureAndRandomlyString();
        int $randomInterval = new FromRandomInterval().randomByInterval(1, 10);

//        System.out.println($privateConstruct);
//        System.out.println($c1.realnaZlozka);
//        System.out.println($c1.imaginarnaZlozka);
//        System.out.println("obsahy: " + Arrays.toString(obsahy) + ", obvody: " + Arrays.toString(obvody));
//        System.out.println(Math.pow(((55.4 - 20) + 4 * 5.1 - (44 - 12)), 3));
        System.out.println($randomInterval);
    }
}
