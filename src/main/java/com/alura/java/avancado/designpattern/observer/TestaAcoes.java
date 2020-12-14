package com.alura.java.avancado.designpattern.observer;

public class TestaAcoes {


    public static void main(String[] args) {

        NotaFiscalBuilder builder = new NotaFiscalBuilder();

        builder.adicionaAcao(new EnviadorEmail());

        builder.adicionaAcao(new Impressora());

        builder.adicionaAcao(new NotaFiscalDao());
        builder.adicionaAcao(new Multiplicador(2));


        builder.comCnpj("12345").comItem(new ItemNota("Item1", 100)).naDataAtual().paraEmpresa("Empresa 1 ").constroi();

    }
}
