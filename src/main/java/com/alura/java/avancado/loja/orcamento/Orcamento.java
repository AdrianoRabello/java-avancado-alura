package com.alura.java.avancado.loja.orcamento;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 22/02/2021 8:01 PM
 **/

@Getter
public class Orcamento {

    private BigDecimal valor;

    private int quantidadeItens;

    public Orcamento (BigDecimal valor, int quantidadeItens){
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }


}
