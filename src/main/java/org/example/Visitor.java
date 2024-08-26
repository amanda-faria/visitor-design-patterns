package org.example;

public interface Visitor {

    String exibirMembro(Membro membro);
    String exibirInstrutor(Instrutor instrutor);
    String exibirRecepcionista(Recepcionista recepcionista);

}