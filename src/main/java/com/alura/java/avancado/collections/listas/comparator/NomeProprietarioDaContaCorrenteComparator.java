package com.alura.java.avancado.collections.listas.comparator;

import java.util.Comparator;

/**
 * @autor Adriano Rabello 09/01/2021 - 9:53 AM
 */
public class NomeProprietarioDaContaCorrenteComparator implements Comparator<ContaCorrente> {



    @Override
    public int compare(ContaCorrente c1, ContaCorrente c2) {


        /** if object 2 value that i want is more than object 1, we return negative number. I define the rule  */

        return c1.getCliente().compareTo(c2.getCliente());
    }
}
