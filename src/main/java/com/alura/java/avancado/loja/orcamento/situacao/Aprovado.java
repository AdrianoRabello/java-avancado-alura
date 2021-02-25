package com.alura.java.avancado.loja.orcamento.situacao;

import com.alura.java.avancado.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 23/02/2021 9:35 AM
 **/
public class Aprovado extends SituacaoOrcamento {


    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {


        return orcamento.getValor().multiply(new BigDecimal("0.02"));

    }

    @Override
    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
