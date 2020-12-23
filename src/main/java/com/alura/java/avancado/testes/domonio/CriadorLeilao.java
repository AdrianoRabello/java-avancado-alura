package com.alura.java.avancado.testes.domonio;

public class CriadorLeilao {

    private Leilao leilao;

    public CriadorLeilao para(String descricao){

        this.leilao = new Leilao(descricao);

        return this;
    }

    public CriadorLeilao lance(Usuario usuario, double valor){

        this.leilao.propoe(new Lance(usuario, valor));

        return this;
    }

    public Leilao constroi(){

        return this.leilao;
    }
}
