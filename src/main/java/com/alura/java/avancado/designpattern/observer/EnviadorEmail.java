package com.alura.java.avancado.designpattern.observer;

public class EnviadorEmail implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {

        System.out.println("Enviando email");
    }
}
