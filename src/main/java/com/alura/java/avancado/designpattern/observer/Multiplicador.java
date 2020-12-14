package com.alura.java.avancado.designpattern.observer;

public class Multiplicador implements AcaoAposGerarNota {

    private double fator;


    public Multiplicador(double fator){

        this.fator = fator;

    }

    @Override
    public void executa(NotaFiscal nf) {

        System.out.println(nf.getValorBruto() * this.fator);
    }
}
