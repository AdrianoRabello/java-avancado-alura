package com.alura.java.avancado.designpattern.state.example2;

public class Positivo implements EstadoConta {

    @Override
    public void deposita(Conta conta, double valor) {

        conta.saldo += valor * 0.98;
    }

    @Override
    public void saca(Conta conta, double valor) {

        conta.saldo -= valor;

        if(conta.saldo < 0 ) conta.estado = new Negativo();
    }
}
