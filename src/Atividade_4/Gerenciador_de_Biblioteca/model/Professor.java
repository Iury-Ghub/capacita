package Atividade_4.Gerenciador_de_Biblioteca.model;

import Atividade_4.Gerenciador_de_Biblioteca.classificacao.Classificacao;

public class Professor extends Usuario{
    private Classificacao classificacao;

    public Professor(ID ID,String nome) {
        super(ID,nome);
        this.classificacao = Classificacao.PROFESSOR;
    }

    @Override
    public Classificacao getClassificacao() {
        return classificacao;
    }

    @Override
    public String classificacao(){
        return "Professor";
    }

}
