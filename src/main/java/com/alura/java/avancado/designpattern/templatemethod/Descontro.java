package com.alura.java.avancado.designpattern.templatemethod;


/** @Template Method
 * Quando devemos aplicar o padrão Template Method?
 *

 Quando temos diferentes algoritmos que possuem estruturas parecidas, o Template Method é uma boa solução.
 Com ele, conseguimos definir, em um nível mais macro, a estrutura do algoritmo e deixar "buracos",
 que serão implementados de maneira diferente por cada uma das implementações específicas.

 Dessa forma, reutilizamos ao invés de repetirmos código, e facilitamos possíveis evoluções, tanto do
 algoritmo em sua estrutura macro, quanto dos detalhes do algoritmo, já que cada classe tem sua responsabilidade bem separada.

 * Essa é a itnerface  que define o chain of repository pois deifine o meotdo para o proximo repository */
public interface Descontro {

    double desconta(Orcamento orcamento);

    void setNext(Descontro next);
}
