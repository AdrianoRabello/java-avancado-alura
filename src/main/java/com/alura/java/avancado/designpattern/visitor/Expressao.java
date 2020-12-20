package com.alura.java.avancado.designpattern.visitor;

public interface Expressao {

    int avalia();

    void aceita(Visitor impressoraVisitor);
}
