package com.alura.java.avancado.collections.listas.tests;

import com.alura.java.avancado.collections.listas.models.Aula;
import com.alura.java.avancado.collections.listas.models.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @autor Adriano Rabello 29/12/2020 - 6:12 PM
 */
public class TesteAula {

    public static void main(String[] args) {

        Aula aula1 = new Aula("A", 15);
        Aula aula2 = new Aula("B", 25);
        Aula aula3 = new Aula("C",10);

        ArrayList<Aula>  aulas = new ArrayList<>();

        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula1);

        System.out.println(aulas);

        /** eu só consigo faer o colections.sort se a clase inplementar comparable */
        Collections.sort(aulas);
        System.out.println(aulas);

        /** fazendo uma ordenação pelo tempo, que é o segundo para mentro do sorting. A classe deve ter o metodo get do atributo que vamos comparar */
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);

        /** utilizando a propria classe, pois a classe implementa comparable  */
        aulas.sort(Comparator.comparing(Aula::getTempo));


        /***/

        Curso curso = new Curso("Curso de list", "Professor da alura");
        curso.adiciona(new Aula("Aula de unmodifiableList", 27));
        curso.adiciona(new Aula("Aula de unmodifiableList 2 ", 23));
        System.out.println(curso.getAulas());

        /** tranformando uma lista imutavel em mutavel */

        List<Aula> aulasImutaveis = curso.getAulas();
        // eu não consigo fazer isso pois uma lista imutavel não permite adicionar uma aula nela
        //aulasImutaveis.add(new Aula("teste", 5 ));

        // tranformando imutavel em mutavel
        List<Aula> aulasMutaveis = new ArrayList<>(curso.getAulas());
        aulasMutaveis.add(new Aula("Aula mutaveis", 26));
        System.out.println(aulasMutaveis);

        /** somando com stream */
        System.out.println(curso.somaTempo());
    }



}
