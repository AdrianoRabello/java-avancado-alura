package com.alura.java.avancado.designpattern.visitor;


/*
* todo
*
*
*
*
*
*
*
*
*
*


* */
public class Numero implements Expressao {


    private int numero;

    public Numero(int valor ){

        this.numero = valor;
    }

    @Override
    public int avalia() {
        return numero;
    }

    @Override
    public void aceita(Visitor impressoraVisitor) {

        impressoraVisitor.visitaNumero(this);
    }

    public int getNumero() {
        return numero;
    }
}
