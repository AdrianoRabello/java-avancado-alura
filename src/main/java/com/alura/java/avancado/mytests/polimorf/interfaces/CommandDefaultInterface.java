package com.alura.java.avancado.mytests.polimorf.interfaces;

import com.alura.java.avancado.mytests.polimorf.domain.ProjetoLogger;

public interface CommandDefaultInterface {

    ProjetoLogger criarLog(CommandHandler commandHandler);

    void saveLog(ProjetoLogger obj);
}
