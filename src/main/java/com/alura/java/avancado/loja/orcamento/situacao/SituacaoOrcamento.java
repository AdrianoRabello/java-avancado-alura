package com.alura.java.avancado.loja.orcamento.situacao;

import com.alura.java.avancado.loja.exception.DomainException;
import com.alura.java.avancado.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 23/02/2021 9:40 AM
 **/
public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }


    public void aprovar(Orcamento orcamento) {

        throw new DomainException("O orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {

        throw new DomainException("O orlamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {

        throw new DomainException("O orçamento não pode ser finalizado");
    }
}
