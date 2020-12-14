package com.alura.java.avancado.designpattern.state;

import com.alura.java.avancado.designpattern.decorator.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

    protected double valor;

    private List<Item> itens;

    protected  EstadoOrcamento estadoAtual;

    public Orcamento(double valor) {
        this.valor = valor;
        this.itens = new ArrayList<>();
        this.estadoAtual = new EmAprovacao();
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

    public void aplicaDescontroExtra(){

        this.estadoAtual.aplicaDescontoExtra(this);
    }

    public void aprova(){
        estadoAtual.aprova(this);
    }

    public void reprova(){

        estadoAtual.reprova(this);
    }

    public void finaliza(){

        estadoAtual.finaliza(this);
    }


}
