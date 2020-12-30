package com.alura.java.avancado.mytests.polimorf.commands;

public class AvancarStatusProjetoCommand {


    public AvancarStatusProjetoCommand(){

    }

    public AvancarStatusProjetoCommand(int id){

        this.idProjeto = id;
    }

    private Integer idProjeto;

    public Integer getIdProjeto() {
        return idProjeto;
    }

    public void setIdProjeto(Integer idProjeto) {
        this.idProjeto = idProjeto;
    }
}
