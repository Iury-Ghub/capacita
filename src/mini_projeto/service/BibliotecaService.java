package mini_projeto.service;

import mini_projeto.classificacao.Classificacao;
import mini_projeto.exceptions.LimiteDeLivrosExcedidoExeption;
import mini_projeto.exceptions.LivroIndisponivelException;
import mini_projeto.exceptions.LivroNaoEncontradoExeption;
import mini_projeto.exceptions.UsuarioNaoEncontradoExeption;
import mini_projeto.model.ID;
import mini_projeto.model.Livro;
import mini_projeto.model.Usuario;

import java.util.ArrayList;

public class BibliotecaService {
    CadastrosBiblioteca cadastrosBiblioteca;
    CadastrosIDs cadastrosIDs;

    public BibliotecaService(CadastrosBiblioteca cadastrosBiblioteca, CadastrosIDs cadastrosIDs) {
        this.cadastrosBiblioteca = cadastrosBiblioteca;
        this.cadastrosIDs = cadastrosIDs;
    }

    public void emprestarLivro(ID idUsuario,ID idLivro)throws LimiteDeLivrosExcedidoExeption, LivroIndisponivelException{

        Usuario usuario = encontrarUsuario(idUsuario);
        Livro livro = encontrarLivro(idLivro);

        if((usuario.classificacao().equals("Aluno") && usuario.quantidadeLivros() <= 3) || usuario.classificacao().equals("Professor") ){
            livro.setAlugado(true);
            usuario.addLivro(livro);
        }else if ((usuario.classificacao().equals("Aluno") && usuario.quantidadeLivros() > 3)){
            throw new LimiteDeLivrosExcedidoExeption("ERRO: O limite de livros foi excedido");
        }else if (livro.isAlugado()){
            throw new LivroIndisponivelException("ERRO: O livro já foi alugado");
        }
    }

    public Livro encontrarLivro(ID idLivro)throws LivroNaoEncontradoExeption {
        for(Livro livro:cadastrosBiblioteca.livros){
            if (idLivro.equals(livro.getID())){
                return livro;
            }
        }
        throw new LivroNaoEncontradoExeption("ERRO: O livro não foi encontraro");
    }

    public Usuario encontrarUsuario(ID idUsuario)throws UsuarioNaoEncontradoExeption{
        for(Usuario usuario: cadastrosBiblioteca.usuarios){
            if(idUsuario.equals(usuario.getID())){
                return usuario;
            }
        }
        throw new UsuarioNaoEncontradoExeption("ERRO: Usuário não encontrado");
    }

    public void devolverLivro(String stringIdUsuario, String stringIdLivro)throws LivroNaoEncontradoExeption{
        Usuario usuario = encontrarUsuario(cadastrosIDs.encontrarID(stringIdUsuario));
        Livro livro = encontrarLivro(cadastrosIDs.encontrarID(stringIdLivro));

        if(usuario.removeLivro(livro)){
            livro.setAlugado(false);
        }else {
            throw new LivroNaoEncontradoExeption("ERRO: LIvro não encontrado");
        }
    }
}
