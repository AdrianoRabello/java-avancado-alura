package com.alura.java.avancado.designpattern.state;

public class Reprovado implements EstadoOrcamento{

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {

        throw new RuntimeException("Não pode aplicar descontno extra no estado reporvado ");

    }

    @Override
    public void aprova(Orcamento orcamento) {

        throw  new RuntimeException("Orçamento repovado não pode aprovado ");
    }

    @Override
    public void reprova(Orcamento orcamento) {

        throw new RuntimeException("O orçamento não pode ser reprovado novamente ");
    }

    @Override
    public void finaliza(Orcamento orcamento) {

        orcamento.estadoAtual = new Finalizado();
    }
}
