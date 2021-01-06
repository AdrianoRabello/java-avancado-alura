package com.alura.java.avancado.designpattern.command;

import java.util.Calendar;

public class Pedido {

    private String cliente;

    private double valor;

    private Status status;

    private Calendar dataFinalizacao;


    public Pedido(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.status = Status.NOVO;
    }

    public void paga(){
        this.status = Status.PAGO;
    }

    public void separa(){
        this.status = Status.SEPARADO;
    }

    public void finaliza(){


        this.dataFinalizacao = Calendar.getInstance();
        this.status = Status.FINALIZADO;
        System.out.println("Finalizando o pedido do clinete ");
    }

    public Calendar getDataFinalizacao() {
        return dataFinalizacao;
    }

    public String getCliente() {
        return cliente;
    }
}
