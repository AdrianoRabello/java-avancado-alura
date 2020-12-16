package com.alura.java.avancado.designpattern.memento;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    List<Estado> estadosSalvos = new ArrayList<>();

    public void adciona(Estado estado){

        estadosSalvos.add(estado);
    }

    public Estado pega(int index){

        return estadosSalvos.get(index);
    }

}
