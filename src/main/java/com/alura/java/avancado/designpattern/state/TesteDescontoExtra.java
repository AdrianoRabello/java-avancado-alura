package com.alura.java.avancado.designpattern.state;

public class TesteDescontoExtra {


    public static void main(String[] args) {

        Orcamento reparo = new Orcamento(500.0);

        reparo.aplicaDescontroExtra();

        System.out.println(reparo.getValor());

        reparo.aprova();

        reparo.aplicaDescontroExtra();

        System.out.println(reparo.getValor());

        reparo.finaliza();


    }




}
