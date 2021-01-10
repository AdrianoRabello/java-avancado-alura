package com.alura.java.avancado.collections.listas.comparator;

import java.util.Comparator;

/**
 * @autor Adriano Rabello 09/01/2021 - 9:53 AM
 */
public class NumeroContaCorrenteComparator implements Comparator<ContaCorrente> {



    @Override
    public int compare(ContaCorrente c1, ContaCorrente c2) {


        /** if object 2 value that i want is more than object 1, we return negative number. I define the rule  */
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
}
