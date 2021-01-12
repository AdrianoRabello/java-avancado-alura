package com.alura.java.avancado.collections.listas.comparator;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @autor Adriano Rabello 12/01/2021 - 5:30 PM
 */
public class ComparatorCursos {


    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("python",45));
        cursos.add(new Curso("javaScript",150));
        cursos.add(new Curso("java 8",113));
        cursos.add(new Curso("C",55));


        /** sortinf by name*/
        cursos.sort(Comparator.comparing(c -> c.getAlunos()));
        cursos.forEach( c -> System.out.println(c.getNome()));

        /** filtering */

        System.out.println("----------------");

        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));

        /** if i use map in final, i can get the value that i want and to transform */
        List<Integer> collect = cursos.stream().filter(c -> c.getAlunos() >= 100).map(c -> c.getAlunos()).collect(Collectors.toList()); // Integer List
        List<Integer> collect2 = cursos.stream().filter(c -> c.getAlunos() >= 100).map(Curso::getAlunos).collect(Collectors.toList()); // Integer

        /** collectiors */

        List<Curso> collect1 = cursos.stream().filter(c -> c.getAlunos() > 100).collect(Collectors.toList());
        Map<String, Integer> map = cursos.stream().filter(c -> c.getAlunos() > 100).collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));

        System.out.println("------------------- map --------------------");
        System.out.println(map);

        /** foreach in Map*/
        map.forEach((nome, alunos ) -> {
            System.out.println("Nome: " + nome + ", alunos: "+ alunos);
        });
        
        
        /** averange */

        System.out.println("------------------- Avarenge --------------------");

        OptionalDouble average = cursos.stream().mapToInt(c -> c.getAlunos()).average();

        System.out.println("Averange " + average.orElse(0));


    }
}
