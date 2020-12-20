package com.alura.java.avancado.designpattern.interpreter;

public class Programa {


    public static void main(String[] args) {

        Expressao esquerda = new Subtracao( new Numero(10), new Numero(5));

        Expressao direita = new Soma(new Numero(5), new Numero(6));

        Expressao soma = new Soma(esquerda, direita);

        System.out.println(soma.avalia());



        System.out.println(  new RaizQuadrada(new Numero(25)).avalia());
    }
}
