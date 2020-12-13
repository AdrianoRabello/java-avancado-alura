package com.alura.java.avancado.designpattern.decorator.exemplo2;

import java.util.ArrayList;
import java.util.List;




public abstract  class Filtro {

    protected  Filtro proximoFiltro;

    public Filtro(){

    }

    public Filtro(Filtro proximoFiltro){
        this.proximoFiltro = proximoFiltro;
    }

    abstract List<Conta> filtra(List<Conta> contas);

    protected  List<Conta> proximo(List<Conta> contas){

        return proximoFiltro != null ? this.proximoFiltro.filtra(contas) : new ArrayList<>();
    }
}
