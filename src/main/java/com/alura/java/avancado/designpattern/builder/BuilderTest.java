package com.alura.java.avancado.designpattern.builder;

public class BuilderTest {

    public static void main(String[] args) {



        NotaFiscal empreza_xyz =  new NotaFiscalBuilder().comCnpj("123456").naDataAtual().paraEmpresa("Empreza xyz").constroi();


    }
}
