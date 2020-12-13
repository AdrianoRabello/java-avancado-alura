package com.alura.java.avancado.designpattern.templatemethod;

public class ICPP extends TemplateImpostoCondicional {

    @Override
    public double minimaTaxacao(com.alura.java.avancado.designpattern.templatemethod.Orcamento orcamento) {
        return orcamento.getValor() * 0.065;
    }

    @Override
    public double maximaTaxacao(com.alura.java.avancado.designpattern.templatemethod.Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    public boolean deveUsarmaximaTaxacao(Orcamento orcamento) {

        return orcamento.getValor() > 500;
    }


}
