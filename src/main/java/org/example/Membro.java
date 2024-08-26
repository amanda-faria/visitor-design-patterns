package org.example;

public class Membro implements Pessoa {

    private int matricula;
    private String nome;
    private TipoDeTreino processo;

    public Membro(int matricula, String nome, TipoDeTreino processo) {
        this.matricula = matricula;
        this.nome = nome;
        this.processo = processo;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getProcesso() {
        return this.processo.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMembro(this);
    }

}