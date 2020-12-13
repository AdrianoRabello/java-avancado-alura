package com.alura.java.avancado.designpattern.chainofreponsability;

public class DecontroPorCincoItens implements  Descontro {

    private Descontro proximo;

    DecontroPorCincoItens(Descontro proximo){
        this.proximo = proximo;
    }

    @Override
    public double desconta(Orcamento orcamento){

        if(orcamento.getItens().size() > 5 ){

            System.out.println(this.getClass());
            return orcamento.getValor() * 0.1;
        }


       return proximo.desconta(orcamento);
    }

    @Override
    public void setNext(Descontro next) {

        this.proximo = next;
    }
}
