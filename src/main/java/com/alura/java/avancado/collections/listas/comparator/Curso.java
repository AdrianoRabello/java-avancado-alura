package com.alura.java.avancado.collections.listas.comparator;

/**
 * @autor Adriano Rabello 12/01/2021 - 5:29 PM
 */
public class Curso {

    private String nome;
    private int alunos;

    public Curso() {
    }

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }
}
