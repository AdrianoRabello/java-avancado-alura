package com.alura.java.avancado.collections.listas.tests;

import com.alura.java.avancado.collections.listas.models.Aluno;
import com.alura.java.avancado.collections.listas.models.Aula;
import com.alura.java.avancado.collections.listas.models.Curso;

/**
 * @autor Adriano Rabello 30/12/2020 - 7:28 AM
 */
public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso curso = new Curso("Dominando as coleções do Java","Paulo Silveira");

        curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        curso.adiciona(new Aula("Criando uma Aula", 20));
        curso.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        curso.matricula(a1);
        curso.matricula(a2);
        curso.matricula(a3);

        /** o hash map tem uma melhor performance para buscar dados em uma coleção. */
        System.out.println(curso.buscaAlunoMatriculado(34672));

        String teste = "teste";

        boolean teste1 = teste.contains("teste");
        System.out.println(teste.contains("test"));
    }
}
