package com.alura.java.avancado.designpattern.chainofreponsability;

public class CalculadorDescontros {



    public double calcula(Orcamento orcamento){

        /**
         *  desta maneira dentro do meotdo de cada implementação de Desconto o metodo
         *  tranfere a responsabildiade para a proxima regra caso a mesma não seja cumprida */
        Descontro d1 = new DecontroPorCincoItens(new DescontaPorMaisDeQuinhentosReais(new SemDesconto()));
//        Descontro d2 = new DescontaPorMaisDeQuinhentosReais(new SemDesconto());


        /** Coloca o desconto 2 para ser o proximo a ser calculado caso a condição do desconto 1 não seja satisfeita.
         *
         * */
//        d1.setNext(d2);
//        d2.setNext(d0);

        return d1.desconta(orcamento);
    }
}
