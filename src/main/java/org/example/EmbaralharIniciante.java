package org.example;

public class EmbaralharIniciante implements Embaralhador{

    public String embaralhar(String palavra) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(palavra);

        return stringBuilder.reverse().toString();
    }

    public int dificuldade() {
        return 3;
    }
}
