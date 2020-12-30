package com.alura.java.avancado.collections.listas.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @autor Adriano Rabello 29/12/2020 - 8:15 PM
 */
public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int somaTempo(){

        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public List<Aula> getAulas(){
        return Collections.unmodifiableList(aulas);
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }
}
