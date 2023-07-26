package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDePalavras {

    private String diretorioPalavras;

    private static final String arquivoDePalavras = "palavras.txt";

    private static final List<String> listaPalavras = new ArrayList<String>();

    public BancoDePalavras(String diretorioPalavras) {
        this.diretorioPalavras = diretorioPalavras;
        carregarPalavras();
    }

    private void carregarPalavras() {
        File arquivo = new File(diretorioPalavras +"\\"+ arquivoDePalavras);

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(arquivo));
            String linha;

            while( (linha = entrada.readLine() ) != null) {
                listaPalavras.add(linha);
            }
            entrada.close();
        } catch (Exception e) {
            System.out.println("Erro no arquivo "+ diretorioPalavras + arquivoDePalavras);
        }
    }
    public String recuperarPalavra() {
            int indice = new Random().nextInt(listaPalavras.size());
            return listaPalavras.get(indice);
    }

    public int totalPalavras() {
        return listaPalavras.size();
    }

}
