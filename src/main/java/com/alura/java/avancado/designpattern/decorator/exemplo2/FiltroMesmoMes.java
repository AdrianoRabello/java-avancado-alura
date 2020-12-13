package com.alura.java.avancado.designpattern.decorator.exemplo2;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroMesmoMes extends Filtro {



    @Override
    List<Conta> filtra(List<Conta> contas) {

        List<Conta> filtered = contas.stream().filter(conta -> conta.getDataAbertura().get(Calendar.MONTH) == Calendar.MONTH).collect(Collectors.toList());

        filtered.addAll(proximo(contas));

        return filtered;

    }
}
