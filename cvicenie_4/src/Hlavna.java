import java.util.Locale;
import java.util.Scanner;

public class Hlavna {
    // Random string sme generovali v predchadzajucom cviceni, v tomto som si to pozrel, ako to funguje, bolo by zbytocne to dalej "len" kopirovat
    // TODO - preskusat si volanie statickej metody bez vytvorenia instancie
    public static void main(String[] args) {

        int k = 0;
        F pole[] = new F[args.length];
        for (String s : args){
            pole[k] = new F(s);
            System.out.println(pole[k].farba);
            k++;
        }

        System.out.println(E.a());
        System.out.println(E.A);

        E e = new E();
        System.out.println(e.A);
        System.out.println(e.a());

        Stopwatch $s = new Stopwatch();
        for (int i = 0; i < 100000; i++) {} // Nejaky cyklus, nech nie je elapsed time 0
        System.out.println($s.elapsedTime()); // Celkovo zaujimava vec, mozno sa da pouzit pri debugovani? Kedy sa vytvorila aka trieda, v akom poradi

        new Pretazovanie().zakric();
        System.out.println(LubovolnyTyp.bem());

        System.out.println(Pretazovanie.zakric(1));

        System.out.println(Cestujuci.getPocetInstancii());

        for (int i = 0; i < 10; i++) {
            new H();
        }

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Zadajte suradnice: x, y, z. Tieto suradnice mozu obsahovat hodnotu najviac 50.");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        Bod $bod = new Bod(x, y, z);
        System.out.println("x: " + $bod.x + ", y: " + $bod.y + ", z: " + $bod.z);
    }
}













