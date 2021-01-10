package com.alura.java.avancado.exceptions;

public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo conexao");
        //throw new IllegalStateException();
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        //throw new IllegalStateException();
    }

    /** o metodo  close agora vai ser chamado sempre que cair em uma exeção */
//    public void fecha(){
//        System.out.println("fechando a conexão ");
//    }

    @Override
    public void close() throws Exception {
        System.out.println("Fechando conexao");
    }
}
