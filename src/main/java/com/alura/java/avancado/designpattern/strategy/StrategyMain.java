package com.alura.java.avancado.designpattern.strategy;

public class StrategyMain {


    public static void main(String[] args) {

        Imposto iss = new Iss();
        Imposto Icms = new Icms();

        CalculaImposto calculaImposto = new CalculaImposto();
        Orcamento orcamento = new Orcamento(500.00);

       calculaImposto.realizaCalculo(orcamento, iss);
       calculaImposto.realizaCalculo(orcamento, Icms);
    }
}
