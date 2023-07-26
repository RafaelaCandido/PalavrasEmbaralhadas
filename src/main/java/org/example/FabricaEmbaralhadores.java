package org.example;

import java.util.Random;

public class FabricaEmbaralhadores {

    public static Embaralhador retornaEmbaralhador() {
        int indice = new Random().nextInt(2) + 1;
        if (indice == 1) {
            return new EmbaralharAvancado();
        } else {
            return new EmbaralharIniciante();
        }
    }
}