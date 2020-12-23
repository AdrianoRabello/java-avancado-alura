package com.alura.java.avancado.designpattern.singlitonFacade;


/**
 * todo
 *  O que é uma Façade? Qual problema ela resolve?
 *  Uma façade serve como uma frente única para os serviços disponibilizados por um ou mais sub-sistemas, provendo uma maneira mais simples para o seu consumo.
 *  uma fachada é um ponto único no sistema para que seja possível buscar informações do sistema
 *
 *
 * */
public class EmpresaFacade {

    public Cliente buscaCliente(String cpf){


        /** aqui vem o metodo de busca cliete */
        return new Cliente("Adriano ", "133");
    }

    public Fatura buscaFatura(){

        /** aqui vem o código de buscar a fatura */
        return new Fatura(200);
    }


}
