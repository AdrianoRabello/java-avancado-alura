package com.alura.java.avancado.designpattern.command;

import java.util.ArrayList;
import java.util.List;


/**
 * todo
 *  Qual a diferença entre Command e Strategy?
 *  Novamente, em termos de implementação, eles são bem parecidos, pois dependem de interfaces.
 *  A ideia do Command é abstrair um comando que deve ser executado, pois não é possível executá-lo naquele momento
 *  (pois precisamos por em uma fila ou coisa do tipo).
 *  Já no Strategy, a ideia é que você tenha uma estratégia (um algoritmo) para resolver um problema.

 *  */
public class FilaDeTrabalho {

    public List<Comando> comandos;

    public FilaDeTrabalho(){

        comandos = new ArrayList<>();
    }

    public void adicionaComando(Comando comando){
        this.comandos.add(comando);
    }

    public void processa(){

        for (Comando comando: comandos){
            comando.executa();
        }
    }

}
