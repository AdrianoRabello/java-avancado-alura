package com.alura.java.avancado.loja.orcamento;

import com.alura.java.avancado.loja.orcamento.situacao.EmAnalise;
import com.alura.java.avancado.loja.orcamento.situacao.SituacaoOrcamento;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 22/02/2021 8:01 PM
 **/

@Getter
@Setter
public class Orcamento {

    private BigDecimal valor;
    private SituacaoOrcamento situacao;

    private int quantidadeItens;

    public Orcamento (BigDecimal valor, int quantidadeItens){
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescntoExtra(){

        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);

        this.valor = this.valor.subtract(valorDescontoExtra);

    }

    public void aprovar(){

        this.situacao.aprovar(this);
    }

    public void reprovar(){

        this.situacao.aprovar(this);
    }



}
