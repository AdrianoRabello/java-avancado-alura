package com.alura.java.avancado.designpattern.strategy;

public class CalculaImposto {

    /** Esse padrão de projeto utiliza um interface como estrategia para realizar alguma função para realizar determinada tarefa */
    public void realizaCalculo(Orcamento orcamento, Imposto imposto){

        System.out.println(imposto.calcula(orcamento));
    }
}
