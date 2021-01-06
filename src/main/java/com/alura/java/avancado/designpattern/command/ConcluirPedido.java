package com.alura.java.avancado.designpattern.command;

public class ConcluirPedido implements Comando {


    private Pedido pedido;

    public ConcluirPedido(Pedido pedido) {
        this.pedido = pedido;
    }


    @Override
    public void executa() {

        pedido.finaliza();
    }
}
