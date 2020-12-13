package com.alura.java.avancado.designpattern.templatemethod;

import java.util.ArrayList;
import java.util.List;

public class IHIT extends TemplateImpostoCondicional {

    @Override
    protected double minimaTaxacao(Orcamento orcamento) {

        return orcamento.getValor() * (0.01 * orcamento.getItens().size());
    }

    @Override
    protected double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.13 + 100;
    }

    @Override
    protected boolean deveUsarmaximaTaxacao(Orcamento orcamento) {

        List<String> nomes = new ArrayList<>();

        for (Item item : orcamento.getItens()){

            if(nomes.contains(item.getNome())){

                return true;
            }

            nomes.add(item.getNome());

            return false;
        }
        return false;
    }
}
