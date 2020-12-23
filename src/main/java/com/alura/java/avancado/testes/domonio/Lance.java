package com.alura.java.avancado.testes.domonio;

public class Lance {

    private Usuario usuario;
    private double valor;

    public Lance(Usuario usuario, double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public double getValor() {
        return this.valor;
    }

    public void dobrarValorLance(){

        this.valor = this.valor * 2;
    }
}

