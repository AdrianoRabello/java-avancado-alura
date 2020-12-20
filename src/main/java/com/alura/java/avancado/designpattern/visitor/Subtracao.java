package com.alura.java.avancado.designpattern.visitor;

public class Subtracao implements Expressao {


    private Expressao esquerda;
    private Expressao direita;

    public Subtracao(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int avalia() {

        int valorDaEsquerda = esquerda.avalia();
        int valorDaDireita = direita.avalia();

        return valorDaEsquerda - valorDaDireita;
    }

    @Override
    public void aceita(Visitor impressoraVisitor) {

        impressoraVisitor.visitaSubtracao(this);
    }

    public Expressao getEsquerda() {
        return esquerda;
    }

    public Expressao getDireita() {
        return direita;
    }
}
