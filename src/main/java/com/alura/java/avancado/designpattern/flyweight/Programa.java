package com.alura.java.avancado.designpattern.flyweight;

import java.util.Arrays;
import java.util.List;





public class Programa {

    public static void main(String[] args) {

        NotasMusicais notas = new NotasMusicais();
        List<Nota> musica = Arrays.asList(notas.get("do"),
                notas.get("re"),
                notas.get("mi"),
                notas.get("fa"),
                notas.get("fa"));

        Piano piano = new Piano();

        piano.toca(musica);
    }


}
