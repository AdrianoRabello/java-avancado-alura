package com.alura.java.avancado.designpattern.chainofreponsability;

public class SemDesconto implements  Descontro{


    @Override
    public double desconta(Orcamento orcamento) {

        System.out.println(this.getClass());
        return 0;
    }

    @Override
    public void setNext(Descontro next) {
        // não retorna nada
    }
}
