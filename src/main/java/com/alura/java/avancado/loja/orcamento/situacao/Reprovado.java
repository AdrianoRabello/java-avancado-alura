package com.alura.java.avancado.loja.orcamento.situacao;

import com.alura.java.avancado.loja.orcamento.Orcamento;

/**
 * @autor adriano rabello 23/02/2021 9:37 AM
 **/
public class Reprovado extends  SituacaoOrcamento{


    @Override
    public void finalizar(Orcamento orcamento) {

        orcamento.setSituacao(new Finalizado());
    }
}
