package com.alura.java.avancado.designpattern.decorator.exemplo2;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroContaSaldoMaiorQue500Reais extends Filtro {


    FiltroContaSaldoMaiorQue500Reais(){

    }

    public FiltroContaSaldoMaiorQue500Reais(Filtro proximoFiltro) {
        super(proximoFiltro);
    }

    @Override
    List<Conta> filtra(List<Conta> contas) {

        List<Conta> filtered = contas.stream().filter(conta -> conta.getSaldo() > 500).collect(Collectors.toList());

        filtered.addAll(proximo(contas));

        return filtered;
    }
}
