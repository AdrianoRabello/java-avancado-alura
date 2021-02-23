package com.alura.java.avancado.loja;

import com.alura.java.avancado.loja.imposto.CalculadoraImpostos;
import com.alura.java.avancado.loja.imposto.ICMS;
import com.alura.java.avancado.loja.imposto.ISS;
import com.alura.java.avancado.loja.imposto.TipoImposto;
import com.alura.java.avancado.loja.orcamento.Orcamento;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 22/02/2021 8:19 PM
 **/

@Slf4j
public class TestImposto {

    public static void main(String[] args) {


        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);

        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();

        log.info(calculadoraImpostos.calcular(orcamento, new ISS()).toString());
        log.info(calculadoraImpostos.calcular(orcamento, new ICMS()).toString());

    }
}
