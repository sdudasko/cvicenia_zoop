import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hlavny {

    public static void main(String[] args) {
        // Agregacia
        Obyvatel $o1 = new Obyvatel("Jan", 170, 70);
        Obyvatel $o2 = new Obyvatel("Fero", 170, 70);
        Obyvatel $o3 = new Obyvatel($o1);

        $o1.meno = "Jozef";

//        System.out.println($o3.meno);

        List<Kniha> knihy = new ArrayList<Kniha>();

        Kniha $k1 = new Kniha("Traja Patraci");
        Kniha $k2 = new Kniha("Ako sa ludia hraju");

        knihy.add($k1);
        knihy.add($k2);

        for (int abc = 0; abc < 3; abc++)
        {
            new Clovek("Pato", 1823).vypisInformacie();
        }
        // testovanie kompozicie
        Kniznica $kniznica = new Kniznica(knihy);
        $kniznica = null;
        System.out.println($k1.nazov);
//        System.out.println($kniznica.knihy.get(0).nazov);

        int len = args.length;
        O o[] = new O[len];

        int j = 0;
        for (int i = 0; i < len/2; i += 2) {

            o[j] = new O(args[i], Integer.parseInt(args[i+1]));
            System.out.println("Meno: " + o[j].meno + ", vek: " + o[j].vek);
            j++;
        }

    }
}
