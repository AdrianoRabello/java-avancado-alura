package com.alura.java.avancado.exceptions;

public class TestaConexao {


    public static void main(String[] args) throws Exception {


        /** Código nomal com try cath. mas não conseguimos fechar a conexão pois na instanciação do objeto temos um erro, pois o erro está na instanciação
         *
         * */
//        Conexao con = null;
//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch(IllegalStateException ex) {
//            System.out.println("Deu erro na conexao");
//        } finally {
//            System.out.println("finally");
//            if(con != null) {
//                con.fecha();
//            }
//        }

        /** Para utilizar desta forma temos que fazer a flasse implementar a interface, para o proprio try chamar um método de fechamento da classe  */
        try (Conexao conexao = new Conexao()) {

            conexao.leDados();
        }catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }finally { // o finally sempre será executado, com ou sem exeção
            System.out.println("teste");
        }
    }
}
