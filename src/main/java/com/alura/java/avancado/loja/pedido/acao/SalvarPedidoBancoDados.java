package com.alura.java.avancado.loja.pedido.acao;

import com.alura.java.avancado.loja.pedido.Pedido;

/**
 * @autor adriano rabello 24/02/2021 9:54 AM
 **/
public class SalvarPedidoBancoDados implements AcaoApoGerarPedido {



    public void executar(Pedido pedido){

        System.out.println("Salvando pedido no DB");
    }
}
