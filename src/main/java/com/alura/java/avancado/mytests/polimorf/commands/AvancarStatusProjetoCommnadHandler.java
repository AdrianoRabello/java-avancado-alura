package com.alura.java.avancado.mytests.polimorf.commands;

import com.alura.java.avancado.mytests.polimorf.abstracts.AvancarStatusAbstract;
import com.alura.java.avancado.mytests.polimorf.domain.ProjetoLogger;
import com.alura.java.avancado.mytests.polimorf.interfaces.CommandHandler;

public class AvancarStatusProjetoCommnadHandler extends AvancarStatusAbstract<AvancarStatusProjetoCommand> {




    @Override
    public ProjetoLogger criarLog(CommandHandler commandHandler) {


        System.out.println("criadno log dento do ancar status ");
        return null;
    }
}
