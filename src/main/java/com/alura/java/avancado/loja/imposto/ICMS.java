package com.alura.java.avancado.loja.imposto;

import com.alura.java.avancado.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 22/02/2021 8:36 PM
 **/


public class ICMS implements Imposto {


    @Override
    public BigDecimal calcular(Orcamento orcamento){

        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
