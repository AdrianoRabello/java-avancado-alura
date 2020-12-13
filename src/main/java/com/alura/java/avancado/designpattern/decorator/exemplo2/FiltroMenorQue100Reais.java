package com.alura.java.avancado.designpattern.decorator.exemplo2;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroMenorQue100Reais extends Filtro {


    public FiltroMenorQue100Reais(){

    }

    public FiltroMenorQue100Reais(Filtro proximoFiltro) {
        super(proximoFiltro);
    }

    @Override
    List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtered = contas.stream().filter(conta -> conta.getSaldo() < 100).collect(Collectors.toList());

        filtered.addAll(proximo(contas));

        return filtered;
    }
}
