package com.alura.java.avancado.loja.desconto;

import com.alura.java.avancado.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 22/02/2021 8:45 PM
 **/
public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {

        Desconto desconto = new DescontoParaOrcamentoMaiorQue500Reais(new DescontoParaOrcamentoMaisDe5Itens(new SemDesconto()));

        return desconto.calcular(orcamento);


    }
}
