package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class BancoDePalavrasTest {
    
    private BancoDePalavras bancoDePalavras;
    
    @Before
    public void setUp() {

    }

    @Test
    public void carregarListaComSucesso() {
        bancoDePalavras = new BancoDePalavras(System.getProperty("user.dir"));
    }

    @Test(expected = IOException.class)
    public void carregarListaComErro() throws IOException {
        bancoDePalavras = new BancoDePalavras("test.txt");
    }

    @Test
    public void recuperarPalavraComSucesso() {
        bancoDePalavras = new BancoDePalavras(System.getProperty("user.dir"));
        List<String> palavrasEsperadas = Arrays.asList(
                "cabeça",
                "quimera",
                "microfone",
                "computador",
                "churrasqueira",
                "jovem",
                "estrada",
                "padaria",
                "mercado",
                "escola",
                "ventilador",
                "escritório",
                "celular",
                "despensa",
                "gorila",
                "restaurante",
                "aniversário",
                "anoitecer",
                "cruzeiro",
                "arquipélogo"
        );

        String palavra = bancoDePalavras.recuperarPalavra();

        Assert.assertTrue(palavrasEsperadas.contains(palavra));
    }

}