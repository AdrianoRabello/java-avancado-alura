package com.alura.java.avancado.solid;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Funcionario {

    private int id;
    private String nome;
    private Cargo cargo;
    private Calendar dataDeAdmissao;
    private double salarioBase;

    public double calculaSalraio(){

        return this.getCargo().getRegra().calcula(this);
    }
}
