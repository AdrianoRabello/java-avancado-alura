package com.alura.java.avancado.designpattern.chainofreponsability;


/**
 *

 O padrão Chain of Responsibility cai como uma luva quando temos uma lista de comandos
 a serem executados de acordo com algum cenário em específico, e sabemos também qual o
 próximo cenário que deve ser validado, caso o anterior não satisfaça a condição.

 Nesses casos, o Chain of Responsibility nos possibilita a separação de responsabilidades
 em classes pequenas e enxutas, e ainda provê uma maneira flexível e desacoplada de juntar
 esses comportamentos novamente.

 * */
public class ChainOfRepositoryMain {

    public static void main(String[] args) {

        CalculadorDescontros calculadorDescontros = new CalculadorDescontros();

        Orcamento orcamento = new Orcamento(600.00);
        orcamento.adicionaItem(new Item("Mouse ", 100.00));
        orcamento.adicionaItem(new Item("Monitor ", 600.00));

        double desontroFinal = calculadorDescontros.calcula(orcamento);

        System.out.println("Valor d odesconto " + desontroFinal);

    }
}
