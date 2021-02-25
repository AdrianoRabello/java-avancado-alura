package com.alura.java.avancado.loja.pedido;

import com.alura.java.avancado.loja.orcamento.Orcamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @autor adriano rabello 24/02/2021 8:48 AM
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {

    private String cliente;
    private LocalDateTime data;
    private Orcamento orcamento;


}
