package com.alura.java.avancado.testes;

import com.alura.java.avancado.testes.domonio.Lance;
import com.alura.java.avancado.testes.domonio.Leilao;
import com.alura.java.avancado.testes.domonio.Usuario;
import com.alura.java.avancado.testes.service.Avaliador;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.List;


public class TesteDoAvaliador {


    @Test
    public void deveEntenderLanceEmOrdemCrecente() {


        /** montanto o cenario */
        Usuario joao = new Usuario("adriano");
        Usuario maria = new Usuario("adriano");
        Usuario jose = new Usuario("adriano");
        Leilao leilao = new Leilao("Video game Playtation 3");

        leilao.propoe(new Lance(joao, 250));
        leilao.propoe(new Lance(jose, 350));
        leilao.propoe(new Lance(maria, 400));

        /** parte 2 a ação */
        Avaliador leiloeiro = new Avaliador();
        leiloeiro.avalia(leilao);

        /** parte 3 validaçõo  */
        double maiorEsperado = 400;
        double menorEsperado = 250;

        assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
        assertEquals(menorEsperado, leiloeiro.getMenorLannce(), 0.00001);
    }


    @Test
    public void deveEntenderLeilaoComApenasUmLance() {

        Usuario joao = new Usuario("João");

        Leilao leilao = new Leilao("Pastation 3 novo ");

        leilao.propoe(new Lance(joao, 1000));

        Avaliador leiloeiro = new Avaliador();

        leiloeiro.avalia(leilao);

        assertEquals(1000, leiloeiro.getMaiorLance(), 0000.1);
        assertEquals(1000, leiloeiro.getMenorLannce(), 0000.1);

    }

    @Test
    public void deveEncontrarOsTresMaioresLances() {

        Usuario joao = new Usuario("Joao");
        Usuario maria = new Usuario("Maria");

        Leilao leilao = new Leilao("Pastation 3 ");

        leilao.propoe(new Lance(joao, 100));
        leilao.propoe(new Lance(maria, 200.0));
        leilao.propoe(new Lance(joao, 300.0));
        leilao.propoe(new Lance(maria, 400.0));
        leilao.propoe(new Lance(maria, 100.0));


        Avaliador leiloeiro = new Avaliador();

        leiloeiro.avalia(leilao);

        List<Lance> maiores = leiloeiro.getTresMaiores();

        assertEquals(3, maiores.size());
        assertEquals(400.0, maiores.get(0).getValor(), 0000.1);
        assertEquals(300.0, maiores.get(1).getValor(), 0000.1);
        assertEquals(200.0, maiores.get(2).getValor(), 0000.1);


    }

    @Test
    public void deveEntenderLeilaoComLancesEmOedemRamdomica() {

        Usuario joao = new Usuario("Jõao");
        Usuario maria = new Usuario("Maria");
        Usuario jose = new Usuario("José");

        Leilao leilao = new Leilao("Tenis de corrida");

        leilao.propoe(new Lance(joao, 500.0));
        leilao.propoe(new Lance(maria, 100.0));
        leilao.propoe(new Lance(jose, 250.0));
        leilao.propoe(new Lance(jose, 50.0));


        Avaliador leiloeiro = new Avaliador();

        leiloeiro.avalia(leilao);

        assertEquals(50.0, leiloeiro.getMenorLannce(), 0000.1);
        assertEquals(500.0, leiloeiro.getMaiorLance(), 0000.1);


    }
}
