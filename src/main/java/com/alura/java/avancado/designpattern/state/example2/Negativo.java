package com.alura.java.avancado.designpattern.state.example2;

public class Negativo implements EstadoConta{

    @Override
    public void deposita(Conta conta, double valor) {

        conta.saldo += valor * 0.95 ;
    }

    @Override
    public void saca(Conta conta, double valor) {

        throw  new RuntimeException("A conta esta com saldo negativo ");
    }
}
