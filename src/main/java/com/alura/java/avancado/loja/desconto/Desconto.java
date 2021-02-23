package com.alura.java.avancado.loja.desconto;

import com.alura.java.avancado.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 23/02/2021 7:15 AM
 **/
public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento) {

        return deveAplicar(orcamento) ? efetuarCalculo(orcamento) : proximo.efetuarCalculo(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);


    protected abstract boolean deveAplicar(Orcamento orcamento);
}
