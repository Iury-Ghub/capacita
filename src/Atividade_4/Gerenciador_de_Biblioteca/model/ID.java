package Atividade_4.Gerenciador_de_Biblioteca.model;

public class ID {
    String classificacao;
    int numero;

    public ID(String classificacao, int numero) {
        this.classificacao = classificacao;
        this.numero = numero;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return getClassificacao()+numero;
    }
}
