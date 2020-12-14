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

    private List<ItemNota> todosItens = new ArrayList<ItemNota>();
    private double valorBruto;
    private double impostos;
    private String observacoes;
    private Calendar data;

    public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;
        return this;
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

    public NotaFiscalBuilder comObservacoes(String observacoes) {
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
}
