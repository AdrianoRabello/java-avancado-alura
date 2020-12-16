package com.alura.java.avancado.designpattern.memento;

import java.util.Calendar;

public class Programa {

    public static void main(String[] args) {

        Historico historico = new Historico();
        Contrato c1  = new Contrato(Calendar.getInstance(), "Adriano", TipoContrato.NOVO);
        historico.adciona(c1.salvaEstado());

        System.out.println(c1.getTipo());
        c1.avanca();
        historico.adciona(c1.salvaEstado());
        System.out.println(c1.getTipo());

        c1.avanca();
        historico.adciona(c1.salvaEstado());
        System.out.println(c1.getTipo());


        System.out.println(historico.pega(0).getEstado().getTipo());

    }
}
