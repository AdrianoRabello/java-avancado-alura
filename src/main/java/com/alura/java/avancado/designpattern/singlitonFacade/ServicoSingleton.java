package com.alura.java.avancado.designpattern.singlitonFacade;


/**
 * todo
 *  singleton -> nos ajuda a ter uma única instância do objeto ao longo do sistema
 *  Quais são os problemas do Singleton?
 *  O Singleton possibilita que o usuário crie uma instância global para determinado objeto.
 *  Isso pode ser interessante, mas tem problemas similares ao de variáveis globais no mundo procedural, afinal o objeto é único e disponível para todos.
 *  Se não usar com parcimônia, o seu código sofrerá problemas de manutenção.

 * */
public class ServicoSingleton {

    private static Servico instancia;

    protected Servico ServicoSingleton() {

        if (instancia == null) {
            instancia = new Servico();

        }

        return instancia;
    }


}
