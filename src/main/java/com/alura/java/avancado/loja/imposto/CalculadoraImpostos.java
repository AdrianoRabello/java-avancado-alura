package com.alura.java.avancado.loja.imposto;

import com.alura.java.avancado.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 22/02/2021 8:10 PM
 **/
public class CalculadoraImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){


        return imposto.calcular(orcamento);
    }
}
