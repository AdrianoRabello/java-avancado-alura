package com.alura.java.avancado.loja;

import com.alura.java.avancado.loja.desconto.CalculadoraDeDescontos;
import com.alura.java.avancado.loja.imposto.CalculadoraImpostos;
import com.alura.java.avancado.loja.imposto.ICMS;
import com.alura.java.avancado.loja.imposto.ISS;
import com.alura.java.avancado.loja.orcamento.Orcamento;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 22/02/2021 8:19 PM
 **/

@Slf4j
public class TestDesconto {

    public static void main(String[] args) {


        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento1 = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadoraImpostos = new CalculadoraDeDescontos();



        log.info(calculadoraImpostos.calcular(orcamento).toString());
        log.info(calculadoraImpostos.calcular(orcamento1).toString());

    }
}
