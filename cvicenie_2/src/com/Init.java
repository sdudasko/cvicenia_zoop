package com; // Ked kazdy riadok kodu, taky kazdy riadok, nastavujeme package, v ktorej pracujeme
// tabulator
// tabulator
public class Init { // Zaciatok triedy Init
    // tabulator
    public static void main(String[] args) // definicia funkcie main
    { // zatvorka
        Student feri = new Student("Feri"); // vytvorenie instancie
        // tabulator
        int pocet = (int) (Math.random() * 2); // pomocna premenna, kde vyratame pocet kamaratov pre Fera
        feri.setPocetKamosov(pocet); // setujeme pocet kamosov, kedze je jeho pocet kamosov private access, tak cez setter
        // tabulator
        if (feri.maKamosov()) { // pozerame sa, ci ma Frantisek kamaratov
            System.out.println(feri.meno + " ma " + feri.getPocetKamosov() + " kamosa."); // ma
        } else { // ked sa nesplni podmienka
            System.out.println(feri.meno + " nema kamosov. Bohuzial."); // nema
        } // koniec zatvorky
        // tabulator
        Student.main(); // volame standardnu cast programu pre studenta
        feri.setState("V skole"); // vyplname atribut studenta
        feri.getState(); // vypiseme si jeho stav, optimalnejsie by bolo returnovat stav a printovat ho sem, ale je to len ilustracne
        feri.zavoajJavaApiMethod(); // volame funkciu z java api 10
        // tabulator
        for (int i = 0; i < 10; i++) { // vytvarame instancie objektu/classy student
            Student stefo = new Student("Stevo" + i); // vytvarame
            System.out.println(stefo.meno); // printujeme
        } //koniec zatvorky
    // tabulator
    } // koniec zatvorky
} // koniec zatvorky
// tabulator