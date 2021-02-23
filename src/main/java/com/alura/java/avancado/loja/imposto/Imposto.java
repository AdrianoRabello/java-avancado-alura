package com.alura.java.avancado.loja.imposto;

import com.alura.java.avancado.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/**
 * @autor adriano rabello 22/02/2021 8:35 PM
 **/
public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
