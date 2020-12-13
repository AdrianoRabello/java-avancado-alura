package com.alura.java.avancado.designpattern.decorator;




/**
 *
 *
 * */
public abstract class TemplateImpostoCondicional extends Imposto {

    @Override
    public final double calcula(Orcamento orcamento) {

        return deveUsarmaximaTaxacao(orcamento) ? maximaTaxacao(orcamento) + calculoOutroImposto(orcamento): minimaTaxacao(orcamento) + calculoOutroImposto(orcamento);
    }

    protected abstract  double minimaTaxacao(Orcamento orcamento);

    protected abstract  double maximaTaxacao(Orcamento orcamento);

    protected abstract  boolean deveUsarmaximaTaxacao(Orcamento orcamento);
}
