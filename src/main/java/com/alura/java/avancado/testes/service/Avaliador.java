package com.alura.java.avancado.testes.service;

import com.alura.java.avancado.testes.domonio.Lance;
import com.alura.java.avancado.testes.domonio.Leilao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Avaliador {

    private double maiorDeTodos = Double.NEGATIVE_INFINITY;

    private double menorDeTodos = Double.POSITIVE_INFINITY;

    private List<Lance> maiores;

    public void avalia(Leilao leilao) {

        for (Lance lance : leilao.getLances()) {


            if (lance.getValor() > maiorDeTodos) maiorDeTodos = lance.getValor();
            if (lance.getValor() < menorDeTodos) menorDeTodos = lance.getValor();
        }


        // with Collections and sort

        maiores = new ArrayList<>(leilao.getLances());
        Collections.sort(maiores, new Comparator<Lance>() {
            public int compare(Lance o1, Lance o2) {
                if(o1.getValor() < o2.getValor()) return 1;
                if(o1.getValor() > o2.getValor()) return -1;
                return 0;
            }
        });

        // with stream
//        maiores = leilao.getLances();
//
//        maiores = maiores.stream().sorted(Comparator.comparing(Lance::getValor).reversed()).collect(Collectors.toList());
        maiores = maiores.subList(0, maiores.size() > 3 ? 3 : maiores.size());




    }

    public List<Lance> getTresMaiores() {
        return maiores;
    }

    public double getMaiorLance() {
        return maiorDeTodos;
    }

    public double getMenorLannce() {
        return menorDeTodos;
    }
}
