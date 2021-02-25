package com.alura.java.avancado.loja;

import com.alura.java.avancado.loja.pedido.GeraPedido;
import com.alura.java.avancado.loja.orcamento.GerarPedidoHandler;
import com.alura.java.avancado.loja.pedido.acao.EnviarEmailPedido;
import com.alura.java.avancado.loja.pedido.acao.SalvarPedidoBancoDados;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @autor adriano rabello 24/02/2021 8:50 AM
 **/
public class TestPedido {

    public static void main(String[] args) {

        String cliente = "Adriano";
        BigDecimal valorOrvamento = new BigDecimal(500);
        int quantidadeItens = 1;

        GeraPedido gerador = new GeraPedido(cliente,valorOrvamento, quantidadeItens);

        /** neste poonto entraria a injeção de dependencia para passar para o handler*/
        GerarPedidoHandler gerarPedidoHandler = new GerarPedidoHandler(Arrays.asList(new SalvarPedidoBancoDados(), new EnviarEmailPedido()));

        gerarPedidoHandler.execute(gerador);
    }
}
