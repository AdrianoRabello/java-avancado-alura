package com.alura.java.avancado;

import com.alura.java.avancado.testes.domonio.CriadorLeilao;
import com.alura.java.avancado.testes.domonio.Lance;
import com.alura.java.avancado.testes.domonio.Leilao;
import com.alura.java.avancado.testes.domonio.Usuario;
import com.alura.java.avancado.testes.service.Avaliador;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

/**
 * todo
 * O que é TDD?
 * TDD é uma prática de desenvolvimento de software na qual o programador escreve um teste antes do código. TDD nos traz segurança e feedback constante sobre a qualidade do nosso código.
 * É uma boa prática para todos desenvolvedores de software!
 **/


@SpringBootTest
@RunWith(JUnit4.class)
class AvancadoApplicationTests {


    private static Avaliador leiloeiro;
    private static Usuario steve;
    private static Usuario billGates;


    @BeforeAll
    public static void criaAvaliador() {


        leiloeiro = new Avaliador();
        steve = new Usuario("Steve jobs");
        billGates = new Usuario("Bill Gates");

        System.out.println("criadno avaliador *********************");
    }

    @Test
    void contextLoads() {
    }


    @Test
    public void nãoDeveAceitarDoislancesSeguidosDoMesmoUsuario() {


        Leilao leilao = new CriadorLeilao().para("Macbook pro 15' ")
                .lance(steve, 2000.0)
                .lance(steve, 3000.0).constroi();

        assertEquals(1, leilao.getLances().size());
        assertEquals(2000.0, leilao.getLances().get(0).getValor(), 0000.1);
    }


    @Test

    public void naoDeveAceitarMaisDoQue5LancesDeUmUsuario() {


        Leilao leilao = new CriadorLeilao().para("Macbook Pro 15")
                .lance(steve, 2000.0)
                .lance(billGates, 3000.0)
                .lance(steve, 4000.0)
                .lance(billGates, 5000.0)
                .lance(steve, 6000.0)
                .lance(billGates, 7000.0)
                .lance(steve, 8000.0)
                .lance(billGates, 9000.0)
                .lance(steve, 10000.0)
                .lance(billGates, 11000.0)

                /** deve ser ignorado */
                .lance(steve, 12000.0).constroi();

        assertEquals(10, leilao.getLances().size());
        assertEquals(11000.0, leilao.getLances().get(leilao.getLances().size() - 1).getValor(), 0.00001);


        this.leiloeiro.avalia(leilao);

        System.out.println(leiloeiro.getMaiorLance());


    }

    @Test
    public void dobrarVlorDoUltimoLance() {

        Leilao leilao = new CriadorLeilao().para("Macbook Pro 15").lance(steve, 2000.0).lance(billGates, 3000.0).constroi();

        assertEquals(2000.0, leilao.getLances().get(0).getValor(), 00000.1);
        assertEquals(3000.0, leilao.getLances().get(1).getValor(), 00000.1);

        leilao.dobrarValorlance(steve);
        assertEquals(4000.0, leilao.getLances().get(2).getValor(), 00000.1);
    }


    @Test
    public void naoDeveDobrarCasoNaoHajaLanceAnterior() {

        Leilao leilao = new CriadorLeilao().para("Macbook Pro 15").constroi();

        leilao.dobrarValorlance(steve);

        assertEquals(0, leilao.getLances().size());
    }
}