package com.alura.java.avancado.loja.orcamento.situacao;

import com.alura.java.avancado.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 23/02/2021 9:31 AM
 **/
public class EmAnalise extends SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {

        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public void aprovar(Orcamento orcamento) {

        orcamento.setSituacao(new Aprovado());
    }

    @Override
    public void reprovar(Orcamento orcamento) {

        orcamento.setSituacao(new Reprovado());
    }
}
