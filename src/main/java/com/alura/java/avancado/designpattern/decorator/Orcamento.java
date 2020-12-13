package com.alura.java.avancado.designpattern.decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    private double valor;

    private List<Item> itens;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    /** o metoto Collections.unmodifiableListe só permite add item de dentro da propria classe */
    public void adicionaItem(Item item){
        this.itens.add(item);
    }

    public double getValor() {
        return valor;
    }
}
