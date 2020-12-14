package com.alura.java.avancado.designpattern.state.example2;

public class Conta {


    protected double saldo;

    protected EstadoConta estado;


    public Conta(){

    }

    public Conta( double saldo){


        this.saldo = saldo;

        this.estado = new Positivo();
    }


    public double getSaldo() {
        return saldo;
    }

    public void saca(double valor){

        estado.saca(this, valor);
    }

    public void deposita(double valor){

        estado.deposita(this, valor);
    }


}
