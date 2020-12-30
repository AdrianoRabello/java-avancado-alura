package com.alura.java.avancado.designpattern.templatemethod;

public class Programa {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(600);

        orcamento.adicionaItem(new Item("Playtation", 1500));

        new CalculaImposto().realizaCalculo(orcamento, new IKCV());



    }
}
