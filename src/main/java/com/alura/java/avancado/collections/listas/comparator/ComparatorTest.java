package com.alura.java.avancado.collections.listas.comparator;

import com.alura.java.avancado.designpattern.state.example2.Conta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @autor Adriano Rabello 09/01/2021 - 9:43 AM
 */
public class ComparatorTest {

    public static void main(String[] args) {

        List<ContaCorrente> contas = new ArrayList<>();


        NomeProprietarioDaContaCorrenteComparator nomeProprietarioDaContaCorrenteComparator = new NomeProprietarioDaContaCorrenteComparator();


        contas.add(new ContaCorrente("Adriano", 10));
        contas.add(new ContaCorrente("Aline", 2));
        contas.add(new ContaCorrente("Clara", 1));

        imprime(contas);


        contas.sort(new ContaCorrente());
        imprime(contas);


        /** comparing with cliente */
        //contas.sort(new NomeProprietarioDaContaCorrenteComparator());
        imprime(contas);

        /** sorting with static method with class Collections. Thies method sort List referenced class passeed */
        Collections.sort(contas, Comparator.comparing(ContaCorrente::getCliente));
        imprime(contas);

        /** after implements Comparable i can to sort with static method */
        Collections.sort(contas);
        imprime(contas);


        /** using lambda */

        contas.sort((c1, c2) -> CharSequence.compare(c1.getCliente(),c2.getCliente()));

        imprime(contas);
    }

    private static void imprime(List<ContaCorrente> contas) {
        System.out.println("-------------------------------------");
        contas.stream().forEach(System.out::println);
    }
}
