package com.alura.java.avancado.designpattern.decorator.exemplo2;

import java.util.Calendar;

public class Conta {


    private Calendar dataAbertura;

    private long numeroConta;

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    private void addSaldo(double valor) {
        this.saldo += valor;
    }

    public Calendar getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Calendar dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }
}
