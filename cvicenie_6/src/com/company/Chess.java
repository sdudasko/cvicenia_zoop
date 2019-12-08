package com.company;

import com.bruceekel.simpletest.Test;

public class Chess extends BoardGame {

    private static Test monitor = new Test();

    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
        monitor.expect(new String[]{
                "Game constructor",
                "BoardGame constructor",
                "Chess constructor"
        });
    }
} ///:~