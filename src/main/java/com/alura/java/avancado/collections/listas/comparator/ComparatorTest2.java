package com.alura.java.avancado.collections.listas.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @autor Adriano Rabello 11/01/2021 - 9:26 PM
 */

public class ComparatorTest2 {


    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Clara");
        nomes.add("Adriano Rabello");
        nomes.add("Aline");

        Collections.sort(nomes,new ComparadorPorTamanho());
        System.out.println(nomes);



        nomes.forEach(new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        /** with lambda */
        nomes.forEach((String s) ->{
            System.out.println(s);
        });


        /**if contains jsut one line, we can do this */
        nomes.forEach( s ->  System.out.println(s));



        /** with comparator */
        nomes.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length())
                    return -1;
                if(o1.length() > o1.length())
                    return 1;
                return 0;
            }
        });


        /** with lambda without new */
        nomes.sort(( s1, s2) -> {
            if(s1.length() < s2.length())
                return -1;
            if(s1.length() > s2.length())
                return 1;
            return 0;
        });

        nomes.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }
}


class ComparadorPorTamanho implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

        if(o1.length() < o2.length())
            return -1;
        if(o1.length() > o1.length())
            return 1;
        return 0;
    }


}
