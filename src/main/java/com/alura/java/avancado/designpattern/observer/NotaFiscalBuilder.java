package com.alura.java.avancado.designpattern.observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


/**
 * Quando podemos aplicar o padrão Observer? *

 * Quando o acoplamento da nossa classe está crescendo, ou quando temos diversas ações diferentes
 * a serem executadas após um determinado processo, podemos implementar o Observer.
 * Ele permite que diversas ações sejam executadas de forma transparente à classe principal,
 * reduzindo o acoplamento entre essas ações, facilitando a manutenção e evolução do código.
 * */
public class NotaFiscalBuilder {

    private String razaoSocial;
    private String cnpj;

    private List<ItemNota> todosItens = new ArrayList<ItemNota>();
    private double valorBruto;
    private double impostos;
    private String observacoes;
    private Calendar data;

    private List<AcaoAposGerarNota> todasAcoesASeremExecutadas;

    public NotaFiscalBuilder(List<AcaoAposGerarNota> lista) {
        this.todasAcoesASeremExecutadas = lista;
    }

    public NotaFiscalBuilder(){
        this.todasAcoesASeremExecutadas = new ArrayList<>();
    }

    public void adicionaAcao(AcaoAposGerarNota acao){

        this.todasAcoesASeremExecutadas.add(acao);
    }

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
        NotaFiscal notaFiscal =  new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);

        for(AcaoAposGerarNota acao : todasAcoesASeremExecutadas){
            acao.executa(notaFiscal);
        }


        return notaFiscal;
    }
}
