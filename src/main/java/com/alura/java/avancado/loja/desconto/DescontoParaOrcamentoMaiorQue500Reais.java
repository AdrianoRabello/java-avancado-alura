package com.alura.java.avancado.loja.desconto;

import com.alura.java.avancado.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 23/02/2021 7:11 AM
 **/
public class DescontoParaOrcamentoMaiorQue500Reais extends Desconto {


    public DescontoParaOrcamentoMaiorQue500Reais(Desconto proximo) {
        super(proximo);
    }


    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;

    }
}
