package mini_projeto.model;

import mini_projeto.classificacao.Classificacao;
import mini_projeto.service.CadastrosBiblioteca;

public class Aluno extends Usuario {
    private Classificacao classificacao;

    public Aluno(ID ID,String nome) {
        super(ID,nome);
        this.classificacao = Classificacao.ALUNO;
    }

    @Override
    public Classificacao getClassificacao() {
        return classificacao;
    }

    @Override
    public String classificacao(){
        return "Aluno";
    }
}
