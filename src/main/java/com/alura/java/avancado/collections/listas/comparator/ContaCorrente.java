package com.alura.java.avancado.collections.listas.comparator;

/**
 * @autor Adriano Rabello 09/01/2021 - 9:41 AM
 */


import com.alura.java.avancado.designpattern.state.example2.Conta;

import java.util.Comparator;

/**
 * We need to implement compareTo for Comparator to define the rule to sort
 * Comparable define thefault order to comapre this class
 */
public class ContaCorrente implements Comparator<ContaCorrente>, Comparable<ContaCorrente> {


    private String cliente;
    private Integer conta;


    public ContaCorrente() {
    }




    public ContaCorrente(String cliente, Integer conta) {
        this.cliente = cliente;
        this.conta = conta;
    }


    @Override
    public int compare(ContaCorrente c1, ContaCorrente c2) {


        /** if object 2 value that is more than object 1 value, we return negative number. I define the value  */
        if(c1.getConta() < c2.getConta()){
            return -1;
        }

        /** Inverse of first */
        if(c1.getConta() > c2.getConta()){
            return 1;
        }

        /** if equals return 0 */
        return 0;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "cliente='" + cliente + '\'' +
                ", conta=" + conta +
                '}';
    }



    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }


    @Override
    public int compareTo(ContaCorrente outraConta) {
        return Integer.compare(this.conta, outraConta.conta);
    }
}
