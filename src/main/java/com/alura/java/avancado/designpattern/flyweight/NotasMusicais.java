package com.alura.java.avancado.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;




/*
* todo
*   Qual a diferença entre Factory e Flyweight?
*   Uma Factory instancia uma classe que é importante/complexa, e seu processo de criação deve ser isolado.
*   Um Flyweight serve para quando temos muitas instâncias do mesmo objeto andando pelo sistema, e precisamos economizar.
*   Para tal, o Flyweight faz uso de uma fábrica modificada, que guarda essas instâncias.

*
*
*
* */
public class NotasMusicais {

    private static Map<String, Nota> notas = new HashMap<>();

    static {
        notas.put("do", new Do());
        notas.put("re", new Re());
        notas.put("mi", new Mi());
        notas.put("fa", new Fa());
        notas.put("sol", new Sol());
        notas.put("la", new La());
        notas.put("si", new Si());
    }

    public Nota get(String nome){

        return notas.get(nome);
    }
}
