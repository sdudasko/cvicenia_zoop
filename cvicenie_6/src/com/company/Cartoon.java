package com.company;

import com.bruceekel.simpletest.Test;

public class Cartoon extends Drawing {

    private static Test monitor = new Test();

    public Cartoon() {
        System.out.println("Cartoon constructor");
    }
    public static void main(String[] args) {
        Cartoon x = new Cartoon();
        monitor.expect(new String[]{
                "Art constructor",
                "Drawing constructor",
                "Cartoon constructor"
        });
    }
}