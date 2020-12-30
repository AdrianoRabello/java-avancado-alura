package com.alura.java.avancado.mytests.polimorf.abstracts;

import com.alura.java.avancado.mytests.polimorf.domain.ProjetoLogger;
import com.alura.java.avancado.mytests.polimorf.interfaces.CommandDefaultInterface;

public abstract class AvancarStatusAbstract<T> implements CommandDefaultInterface {


    public AvancarStatusAbstract(){

    }

    public AvancarStatusAbstract(T obj){

    }

    @Override
    public void saveLog(ProjetoLogger obj) {

        System.out.println("salvando log ");
    }
}
