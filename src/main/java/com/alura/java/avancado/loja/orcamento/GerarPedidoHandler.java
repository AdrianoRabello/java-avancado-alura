package com.alura.java.avancado.loja.orcamento;

import com.alura.java.avancado.loja.pedido.GeraPedido;
import com.alura.java.avancado.loja.pedido.Pedido;
import com.alura.java.avancado.loja.pedido.acao.AcaoApoGerarPedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @autor adriano rabello 24/02/2021 9:38 AM
 **/

/** Essa seria a classe para executar as ações de salvar. */
public class GerarPedidoHandler {


    private List<AcaoApoGerarPedido> acoes = new ArrayList<>();

    public GerarPedidoHandler(List<AcaoApoGerarPedido> acoes){

        this.acoes = acoes;
    }

    public void execute(GeraPedido geraPedido){

        Orcamento orcamento = new Orcamento(geraPedido.getValorOrcamento(),geraPedido.getQuantidadeItens());

        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(),orcamento);


        this.acoes.stream().forEach(a -> a.executar(pedido));
    }
}
