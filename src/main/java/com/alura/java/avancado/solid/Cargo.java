package com.alura.java.avancado.solid;


public enum Cargo {

    DESENVOLVEDOR( new DezOuVintePorcento()),
    DBA( new QuinzeOuVontePorCento()),
    TESTER( new QuinzeOuVontePorCento());


    private RegraDeCalculo regra;

    Cargo(RegraDeCalculo regra){

        this.regra = regra;
    }

    public RegraDeCalculo getRegra(){

        return regra;
    }


}
