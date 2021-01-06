package com.alura.java.avancado.designpattern.visitor;

public class Programa {


    public static void main(String[] args) {

        Expressao esquerda = new Subtracao( new Numero(10), new Numero(5));

        Expressao direita = new Soma(new Numero(5), new Numero(6));

        Expressao soma = new Soma(esquerda, direita);

        ImpressoraVisitor impressoraVisitor = new ImpressoraVisitor();
        soma.aceita(impressoraVisitor);


    }
}
