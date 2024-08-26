package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirMembro() {
        Membro membro = new Membro(20, "Amanda", new TipoDeTreino("Bulking"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Membro{matricula=20, nome='Amanda', tipo de treino=Bulking}", visitor.exibir(membro));
    }

    @Test
    void deveExibirInstrutor() {
        Instrutor instrutor = new Instrutor(10, "Taiane", "Educador Físico");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Instrutor{matricula=10, nome='Taiane', titulacao='Educador Físico'}", visitor.exibir(instrutor));
    }

    @Test
    void deveExibirRecepcionista() {
        Recepcionista recepcionista = new Recepcionista(30, "Aline", 2500.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Recepcionista{codigo=30, nome='Aline', salario=2500.0}", visitor.exibir(recepcionista));
    }

}