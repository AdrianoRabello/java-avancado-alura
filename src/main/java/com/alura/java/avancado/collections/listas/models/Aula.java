package com.alura.java.avancado.collections.listas.models;

/**
 * @autor Adriano Rabello 29/12/2020 - 6:12 PM
 */
public class Aula implements Comparable<Aula>{

    private String titulo;

    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }


    /** faz uma comparação entre os titulos das aulas. Se o titulo da atula this for menor, retorna -1, se for igual retorna 0, de for maior detrona 1*/
    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.getTitulo());
    }


    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "titulo='" + titulo + '\'' +
                "tempo='" + tempo + '\'' +
                '}';
    }
}
