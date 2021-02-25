package com.alura.java.avancado.loja.exception;

/**
 * @autor adriano rabello 23/02/2021 9:42 AM
 **/
public class DomainException extends  RuntimeException{

    public DomainException(String message){
        super(message);
    }

}
