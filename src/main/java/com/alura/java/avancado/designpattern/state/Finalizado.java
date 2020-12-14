package com.alura.java.avancado.designpattern.state;

public class Finalizado implements EstadoOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {

        throw new RuntimeException("Orçamento finalizado não pode aplicar desconto extra");

    }

    @Override
    public void aprova(Orcamento orcamento) {

        throw new RuntimeException("Orçamento já finalizado ");
    }

    @Override
    public void reprova(Orcamento orcamento) {

        throw new RuntimeException("Orçamento já finalizado ");
    }

    @Override
    public void finaliza(Orcamento orcamento) {

        throw new RuntimeException("Orçamento já finalizado ");
    }
}
