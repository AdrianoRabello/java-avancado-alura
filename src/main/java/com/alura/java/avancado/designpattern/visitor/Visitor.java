package com.alura.java.avancado.designpattern.visitor;

public interface Visitor {

    void visitaSoma(Soma soma);
    void visitaSubtracao(Subtracao subtracao);
    void visitaNumero(Numero numero);
}
