package mini_projeto.model;

import mini_projeto.classificacao.Classificacao;

import java.util.ArrayList;

public class Usuario {
    private ID ID;
    private String nome;
    private Classificacao classificacao;
    private ArrayList<Livro> livros;

    public Usuario(ID ID,String nome) {
        this.ID = ID;
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void addLivro(Livro livro){
        this.livros.add(livro);
    }

    public boolean removeLivro(Livro livro){
        for(Livro livroEncontrado:livros){
            if (livro.equals(livroEncontrado)){
                this.livros.remove(livro);
                return true;
            }
        }
        return false;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public String classificacao(){
        return "Classificação";
    }

    public int quantidadeLivros(){
        return this.livros.size();
    }

    public void listarLivros(){
        for (Livro livro:livros){
            System.out.printf(
                    """
                    \n
                    ID: %s
                    Nome: %s
                    Autor: %s
                    Alugado %b
                    \n
                    """,livro.getID(),livro.getNome(),livro.getAutor(),livro.isAlugado());
        }
    }

    public ID getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }
}
