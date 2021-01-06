package com.alura.java.avancado.designpattern.command;

public class Programa {


    public static void main(String[] args) {

        Pedido pedido1 = new Pedido("Pedido do adriano", 1500);
        Pedido pedido2 = new Pedido("Pedido da clara ", 500);

        FilaDeTrabalho fila = new FilaDeTrabalho();

        fila.adicionaComando(new PagaPedido(pedido1));
        fila.adicionaComando(new ConcluirPedido(pedido1));
        fila.processa();
    }
}
