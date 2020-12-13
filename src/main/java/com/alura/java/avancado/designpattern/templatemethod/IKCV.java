package com.alura.java.avancado.designpattern.templatemethod;




public class IKCV extends TemplateImpostoCondicional {


    @Override
    protected double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    @Override
    protected boolean deveUsarmaximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQue100Reais(orcamento);
    }

    protected boolean temItemMaiorQue100Reais(Orcamento orcamento){


        for(Item item : orcamento.getItens()){

            if(item.getValor() > 100) return true;
        }

         return false;
    }
}
