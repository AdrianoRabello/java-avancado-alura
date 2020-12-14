package com.alura.java.avancado.designpattern.observer;

public class Impressora implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {

        System.out.println("imprimindo nota fiscal");
    }
}
