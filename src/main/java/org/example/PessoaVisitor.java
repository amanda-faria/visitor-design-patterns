package org.example;
public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirMembro(Membro membro) {
        return "Membro{" +
                "matricula=" + membro.getMatricula() +
                ", nome='" + membro.getNome() + '\'' +
                ", tipo de treino=" + membro.getProcesso() +
                '}';
    }

    @Override
    public String exibirInstrutor(Instrutor instrutor) {
        return "Instrutor{" +
                "matricula=" + instrutor.getMatricula() +
                ", nome='" + instrutor.getNome() + '\'' +
                ", titulacao='" + instrutor.getTitulacao() + '\'' +
                '}';
    }

    @Override
    public String exibirRecepcionista(Recepcionista recepcionista) {
        return "Recepcionista{" +
                "codigo=" + recepcionista.getCodigo() +
                ", nome='" + recepcionista.getNome() + '\'' +
                ", salario=" + recepcionista.getSalario() +
                '}';
    }
}