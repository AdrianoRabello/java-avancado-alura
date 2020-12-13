package com.alura.java.avancado.designpattern.decorator;

public class TesteImpostoComplexo {

    public static void main(String[] args) {
        Imposto iss = new ISS( new ICMS());

        Orcamento orcamento = new Orcamento(500);

        double calcula = iss.calcula(orcamento);

        System.out.println("Valor do imposto " + calcula);
    }
}
