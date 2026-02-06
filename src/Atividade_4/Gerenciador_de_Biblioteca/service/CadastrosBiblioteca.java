package Atividade_4.Gerenciador_de_Biblioteca.service;

import Atividade_4.Gerenciador_de_Biblioteca.exceptions.LivroNaoEncontradoExeption;
import Atividade_4.Gerenciador_de_Biblioteca.exceptions.UsuarioNaoEncontradoExeption;
import Atividade_4.Gerenciador_de_Biblioteca.model.ID;
import Atividade_4.Gerenciador_de_Biblioteca.model.Livro;
import Atividade_4.Gerenciador_de_Biblioteca.model.Usuario;

import java.util.ArrayList;

public class CadastrosBiblioteca{
    ArrayList<Usuario> usuarios;
    ArrayList<Livro> livros;

    public CadastrosBiblioteca() {
        this.usuarios = new ArrayList<>();
        this.livros = new ArrayList<>();
    };

    public void listarUsuarios(){
        for(Usuario usuario:this.usuarios){
            System.out.println("###########");
            System.out.printf("ID: %s\nNome: %s\nClassificação: %s\n",usuario.getID(),usuario.getNome(),usuario.classificacao());
            usuario.listarLivros();
            System.out.println("###########");
        }

    }

    public void listarLivros(){
        for (Livro livro:livros){
            System.out.printf(
                    """
                    ###########
                    ID: %s
                    Nome: %s
                    Autor: %s
                    Alugado %b
                    \n
                    """,livro.getID(),livro.getNome(),livro.getAutor(),livro.isAlugado());
        }
        System.out.println("###########");
    }

    public void cadastrarLivro(Livro livro){livros.add(livro);}

    public void adicionarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public void removerUsuario(ID id)throws UsuarioNaoEncontradoExeption {
        boolean removeu = false;
        for (Usuario usuario : this.usuarios) {
            if (usuario.getID().equals(id)) {
                this.usuarios.remove(usuario);
                removeu = true;
                break;
            }
        }
        if (!removeu) {
            throw new UsuarioNaoEncontradoExeption("Usuário não encontrado");
        }
    }

    public void removerLivro(ID id)throws LivroNaoEncontradoExeption{
        boolean removeu = false;
        for(Livro livro:livros){
            if(livro.getID().equals(id)){
                livros.remove(livro);
                removeu = true;
                break;
            }
        }
        if(!removeu){
            throw new LivroNaoEncontradoExeption("Erro: Livro não encontrado");
        }
    }
}
