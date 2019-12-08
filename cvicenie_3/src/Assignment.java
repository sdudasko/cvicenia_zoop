//: c03:Assignment.java
// Assignment with objects is a bit tricky.
import com.bruceeckel.simpletest.*;

class Number {
    int i;
}

public class Assignment {
    static Test monitor = new Test(); // Vytvarame instanciu testu, ktora bude obsahovat zakladne metody pre testovanie, zatial tam chceme metodu expect, dalej mozno assertEqual, assertSet ...

    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;
//        System.out.println("1: n1.i: " + n1.i +
//                ", n2.i: " + n2.i);
        n1 = n2;
//        System.out.println("2: n1.i: " + n1.i +
//                ", n2.i: " + n2.i);
        n1.i = 27;
//        System.out.println("3: n1.i: " + n1.i +
//                ", n2.i: " + n2.i);

        monitor.expect(new String[] { // Ocakavame, ze trieda monitor ma metodu, ktora bude testovat:
                "1: n1.i: 9, n2.i: 47", // testujeme, ci prve cislo je 9 a druhe 47, v opacnom pripade chceme oznacit test, ako failnuty
                "2: n1.i: 47, n2.i: 47", // testujeme, ci sa cisla rovnaju
                "3: n1.i: 27, n2.i: 27" // testujeme, ci sa cisla rovnaju a su nasetovane
        });
    }
} ///:~