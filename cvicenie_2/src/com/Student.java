package com;
import java.util.*;
import java.lang.reflect.Method;

class Student {

    /**
     * public String meno
     */
    public String meno;
    /**
     * public String pocetKamosov
     */
    private int pocetKamosov;
    /**
     * public String state
     */
    private String state;

    // Setters
    public void setPocetKamosov(int n) {
        this.pocetKamosov = n;
    }
    public void setState(String state) {
        this.state = state;
    }
    // Getters
    public int getPocetKamosov() {
        return this.pocetKamosov;
    }
    public void getState() {
        System.out.println(this.state);
    }

    Student(String meno) {
        this.meno = meno;
    }

    public static void main() {
        System.out.println("" +
                "Vlastné objekty označujeme ako inštancie príslušnej triedy\n" +
                "Napr. počítač s ktorým pracujem je objekt, inštanciou triedy počítačov\n" +
                "Inštancia je konkrétnou realizáciou svojej triedy\n" +
                "Má svoju identitu\n" +
                "Má svoj stav\n" +
                "Má svoje správanie" +
                "");
    }

    public void zavoajJavaApiMethod() { // Vypise nazvy metod v Init classe
        Class classobj = Init.class;
        Method[] methods = classobj.getMethods();
        System.out.println(Arrays.toString(methods));
    }

    public boolean maKamosov() {
        return this.getPocetKamosov() >= 1;
    }

}
