package Atividade_4.Gerenciador_de_Biblioteca.model;

public class Livro {
    private ID ID;
    private String nome;
    private String autor;
    boolean alugado;

    public Livro(ID ID, String nome, String autor) {
        this.ID = ID;
        this.nome = nome;
        this.autor = autor;
        this.alugado = false;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public ID getID() {
        return ID;
    }

    public void setID(ID ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
