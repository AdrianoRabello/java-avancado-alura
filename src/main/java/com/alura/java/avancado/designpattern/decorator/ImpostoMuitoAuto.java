package com.alura.java.avancado.designpattern.decorator;

public class ImpostoMuitoAuto extends Imposto {


    public ImpostoMuitoAuto() {
    }

    public ImpostoMuitoAuto(Imposto outroImposto) {
        super(outroImposto);
    }

    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.2 + calculoOutroImposto(orcamento);
    }
}
