package com.alura.java.avancado.designpattern.decorator;


/**
 * @Decorator
 * Quando devemos aplicar o padrão Decorator?
 *
 * Sempre que percebemos que temos comportamentos que podem ser compostos por comportamentos de outras classes
 * envolvidas em uma mesma hierarquia, como foi o caso dos impostos, que podem ser compostos por outros impostos.
 * O Decorator introduz a flexibilidade na composição desses comportamentos, bastando escolher
 * no momento da instanciação, quais instancias serão utilizadas para realizar o trabalho.
 *
 * */
public abstract  class Imposto {

    protected  Imposto outroImposto;

    public Imposto(Imposto outroImposto){
        this.outroImposto = outroImposto;
    }

    public Imposto(){

    }

    protected  double calculoOutroImposto(Orcamento orcamento){

        return this.outroImposto != null ? this.outroImposto.calcula(orcamento) : 0;
    }


    public abstract  double calcula(Orcamento orcamento);
}
