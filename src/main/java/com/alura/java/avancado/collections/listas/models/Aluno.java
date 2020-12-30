package com.alura.java.avancado.collections.listas.models;

/**
 * @autor Adriano Rabello 29/12/2020 - 10:27 PM
 */
public class Aluno {

    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }
}
