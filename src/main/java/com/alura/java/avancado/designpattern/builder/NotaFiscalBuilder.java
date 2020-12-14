package com.alura.java.avancado.designpattern.builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * Quando podemos aplicar o padrão Builder?
 *
 * Sempre que tivermos um objeto complexo de ser criado, que possui diversos atributos,
 * ou que possui uma lógica de criação complicada, podemos esconder tudo isso em um Builder.
 *
 * */
public class NotaFiscalBuilder {
    private String razaoSocial;
    private String cnpj;
    private double valorTotal;
    private double impostos;
    private Calendar data;
    private String observacoes;

    private double valorBruto;

    private List<ItemNota> todosItens = new ArrayList<>();

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this; // retorno eu mesmo, o próprio builder, para que o cliente continue utilizando
    }

    public NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public NotaFiscalBuilder comItem(ItemNota item) {
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;
        return this;
    }

    public NotaFiscalBuilder comObservacao(String observacoes){

        this.observacoes = observacoes;
        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        this.data = Calendar.getInstance();

        return this;
    }

    public NotaFiscal constroi() {
        return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
    }

    // código continua aqui com a mesma ideia
    // substituindo void por NotaFiscalBuilder e retornando this em todos eles...
}
