package com.alura.java.avancado.designpattern.observer;

public class NotaFiscalDao implements AcaoAposGerarNota {

    @Override
    public void executa(NotaFiscal nf) {

        System.out.println("Persistindo os dados com nota fiscal Dao");
    }
}
