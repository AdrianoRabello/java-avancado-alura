package com.alura.java.avancado.designpattern.command;

public class PagaPedido implements Comando {

    private Pedido pedido;

    public PagaPedido(Pedido pedido){
       this.pedido = pedido;
    }

    @Override
    public void executa() {

        System.out.println("pagando p pedido do cliente " + this.pedido.getCliente());
        this.pedido.paga();
    }
}
