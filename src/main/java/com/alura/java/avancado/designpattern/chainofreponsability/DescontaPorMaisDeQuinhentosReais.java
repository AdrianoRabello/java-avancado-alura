package com.alura.java.avancado.designpattern.chainofreponsability;

public class DescontaPorMaisDeQuinhentosReais implements Descontro {

    private  Descontro proximo;


    DescontaPorMaisDeQuinhentosReais(Descontro descontro){
        this.proximo = descontro;
    }

    @Override
    public double desconta(Orcamento orcamento){
        if(orcamento.getValor() > 500.00){

            System.out.println(this.getClass());
            return orcamento.getValor() * 0.07;
        }

       return proximo.desconta(orcamento);
    }

    @Override
    public void setNext(Descontro next) {

        this.proximo = next;
    }
}
