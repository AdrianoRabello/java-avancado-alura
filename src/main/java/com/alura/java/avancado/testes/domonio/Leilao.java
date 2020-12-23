package com.alura.java.avancado.testes.domonio;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Leilao {

    private String descricao;
    private List<Lance> lances;

    public Leilao(String descricao) {
        this.descricao = descricao;
        this.lances = new ArrayList<>();
    }

    public void propoe(Lance lance) {

        int total = qtdDeLancesDo(lance.getUsuario());

        if(lances.isEmpty() || !ultimolanceDado().getUsuario().equals(lance.getUsuario()) &&  total < 5){
            this.lances.add(lance);
        }

    }

    private int qtdDeLancesDo(Usuario usuario){
        int qtd = 0;

        for (Lance lance: lances){

            if(lance.getUsuario().equals(usuario)) qtd++;

        }

        return qtd;
    }

    private Lance ultimolanceDado(){

        return lances.get(lances.size()-1);
    }


    public void dobrarValorlance(Usuario usuario){

        Lance ultimoLance = getUltimoLanceUsuario(usuario);
        /** dobrando o valor do lance */

        if(ultimoLance != null){
            propoe(new Lance(usuario,ultimoLance.getValor()*2));
        }

    }


    private Lance getUltimoLanceUsuario(Usuario usuario){
        /** pegando o útlimo lance do usuario. Ordedando a lista pelo valor, revertendo ela e pegadno o primeiro elemento, pois retorna um optional */
        Lance lance = this.lances.stream().filter(l -> l.getUsuario().equals(usuario))
                                    .sorted(Comparator.comparing(Lance::getValor).reversed())
                                    .findFirst().orElse(null);

        return lance;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public List<Lance> getLances() {
        return Collections.unmodifiableList(lances);
    }
}
