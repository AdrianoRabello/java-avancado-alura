package com.alura.java.avancado.collections.listas.models;

import java.util.*;

/**
 * @autor Adriano Rabello 29/12/2020 - 8:15 PM
 */
public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);

        /** adiciona no hash set a matricula como chave e o aluno como valor */
        this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
    }

    public int somaTempo(){

        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    public Set<Aluno> getAlunos(){

        return Collections.unmodifiableSet(alunos);
    }

    /** retorna o aluno pelo numero da matricula que é a chave do hashset */
    public Aluno buscaAlunoMatriculado(int numero) {

        if(!matriculaParaAluno.containsKey(numero))
            throw new NoSuchElementException("Elemento não encontrado para a matricula " + numero);
        return this.matriculaParaAluno.get(numero);
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
