package com.alura.java.avancado.loja.pedido;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 24/02/2021 8:57 AM
 *  Essa seria a classe para receber as informações e passar para o handler persistir .
 **/
@Getter
@Setter
@NoArgsConstructor
public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido( String cliente, BigDecimal valorOrcamento, int quantidadeItens){

        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;

    }

}
