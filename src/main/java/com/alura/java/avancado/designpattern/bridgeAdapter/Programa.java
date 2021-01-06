package com.alura.java.avancado.designpattern.bridgeAdapter;


/**
 * todo
 *  Bridge é uma tipo de padrão que faz uso de outro sistema. é a criação de uma interface para comunicação entre sistemas.
 *  Adapater é utilizado quando precisamos utilizar um código legado de alguma sistema, ou até mesmo uma API que seja conplexa
 *  ou que não seja fáicil de utilizar.
 *  Qual a diferença entre Bridge e Adapter?
 *  Em termos de implementação, nenhuma. Em ambas, criamos uma interface e criamos uma implementação por baixo.
 *  A diferença é semântica. A ideia da Bridge é justamente ser uma ponte em dois mundos/sistemas. A ideia do Adapter é esconder alguma "sujeira",
 *  ou adaptar algo que é diferente e não bate com o sistema atual.
 *  É bem comum inclusive que a interface do Adapter já tenha sido pré-definida e já até exista no sistema. Nessa situação,
 *  o programador vai lá para implementar um "adaptador" para o sistema antigo, de forma a caber no modelo já existente.

 *
 * */
public class Programa {


    public static void main(String[] args) {

        Mapa mapa = new GoogleMaps();

        String ruaY = mapa.devolveMapra("Rua y ");
    }


}
