package com.alura.java.avancado.designpattern.strategy;

public class Icms implements Imposto {


    @Override
    public double calcula(Orcamento orcamento) {
        return  orcamento.getValor() * 0.2;
    }
}
