package com.alura.java.avancado.designpattern.chainofreponsability;


/**
 * Em quais situações se torna ideal o uso do padrão Chain of Responsibility? *

 * O padrão Chain of Responsibility cai como uma luva quando temos uma lista de comandos
 * a serem executados de acordo com algum cenário em específico, e sabemos também qual o
 * próximo cenário que deve ser validado, caso o anterior não satisfaça a condição.

 * Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades
 * em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar
 * esses comportamentos novamente.

 *
 * Essa é a itnerface  que define o chain of repository pois deifine o meotdo para o proximo repository */
public interface Descontro {

    double desconta(Orcamento orcamento);

    void setNext(Descontro next);
}
