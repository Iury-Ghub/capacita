package Atividade_4.Gerenciador_de_Biblioteca.main;

import Atividade_4.Gerenciador_de_Biblioteca.exceptions.*;
import Atividade_4.Gerenciador_de_Biblioteca.model.Aluno;
import Atividade_4.Gerenciador_de_Biblioteca.model.ID;
import Atividade_4.Gerenciador_de_Biblioteca.model.Livro;
import Atividade_4.Gerenciador_de_Biblioteca.model.Professor;
import Atividade_4.Gerenciador_de_Biblioteca.service.BibliotecaService;
import Atividade_4.Gerenciador_de_Biblioteca.service.CadastrosBiblioteca;
import Atividade_4.Gerenciador_de_Biblioteca.service.CadastrosIDs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String idLivro, idUsuario;

        Scanner scanner = new Scanner(System.in);
        CadastrosBiblioteca cadastrosBiblioteca = new CadastrosBiblioteca();
        CadastrosIDs cadastrosIDs = new CadastrosIDs();
        BibliotecaService bibliotecaService = new BibliotecaService(cadastrosBiblioteca,cadastrosIDs);


        //Usuários

        cadastrosBiblioteca.adicionarUsuario(new Aluno(cadastrosIDs.IDNovo("A"),"João"));
        cadastrosBiblioteca.adicionarUsuario(new Aluno(cadastrosIDs.IDNovo("A"),"Maria"));
        cadastrosBiblioteca.adicionarUsuario(new Aluno(cadastrosIDs.IDNovo("A"),"Fernando"));
        cadastrosBiblioteca.adicionarUsuario(new Professor(cadastrosIDs.IDNovo("P"),"Senêca"));
        cadastrosBiblioteca.adicionarUsuario(new Professor(cadastrosIDs.IDNovo("P"),"Aristóteles"));

        //Livros

        cadastrosBiblioteca.cadastrarLivro(new Livro(cadastrosIDs.IDNovo(), "O Pequeno Príncipe", "Antoine de Saint-Exupéry"));
        cadastrosBiblioteca.cadastrarLivro(new Livro(cadastrosIDs.IDNovo(), "Dom Casmurro", "Machado de Assis"));
        cadastrosBiblioteca.cadastrarLivro(new Livro(cadastrosIDs.IDNovo(), "1984", "George Orwell"));
        cadastrosBiblioteca.cadastrarLivro(new Livro(cadastrosIDs.IDNovo(), "O Alquimista", "Paulo Coelho"));
        cadastrosBiblioteca.cadastrarLivro(new Livro(cadastrosIDs.IDNovo(), "Orgulho e Preconceito", "Jane Austen"));
        cadastrosBiblioteca.cadastrarLivro(new Livro(cadastrosIDs.IDNovo(), "O Hobbit", "J.R.R. Tolkien"));
        cadastrosBiblioteca.cadastrarLivro(new Livro(cadastrosIDs.IDNovo(), "Cem Anos de Solidão", "Gabriel García Márquez"));
        cadastrosBiblioteca.cadastrarLivro(new Livro(cadastrosIDs.IDNovo(), "A Menina que Roubava Livros", "Markus Zusak"));
        cadastrosBiblioteca.cadastrarLivro(new Livro(cadastrosIDs.IDNovo(), "O Código Da Vinci", "Dan Brown"));
        cadastrosBiblioteca.cadastrarLivro(new Livro(cadastrosIDs.IDNovo(), "Ensaio Sobre a Cegueira", "José Saramago"));

        while (true){
            System.out.print(
                    """
                    \n
                    ### BIBLIOTECA ONLINE SIMPLES ###
                    
                    1-Cadastrar Usuário
                    2-Listar Usuários
                    3-Remover Usuário
                    4-Cadastrar Livro
                    5-Alugar Livro
                    6-Devolver livro
                    7-Listar livros
                    8-Remover Livro
                    0-Sair
                    
                    Escolha:\s""");
            try {

                int escolhaMenu = scanner.nextInt();

                switch (escolhaMenu) {
                    case 1:
                    while (true){
                        try {
                            scanner.nextLine();
                            System.out.print("Qual o nome do Usuário: ");
                            String nome = scanner.nextLine();
                            boolean classificacaoEscolhida = false;
                            label:
                            while (!classificacaoEscolhida) {
                                System.out.println(
                                        """
                                                P-Professor
                                                A-Aluno
                                                0-sair
                                                """);
                                String escolhaClassificacao = scanner.next().toUpperCase();

                                switch (escolhaClassificacao) {
                                    case "A":
                                        cadastrosBiblioteca.adicionarUsuario(new Aluno(cadastrosIDs.IDNovo(escolhaClassificacao.substring(0, 1)), nome));
                                        classificacaoEscolhida = true;
                                        break;
                                    case "P":
                                        cadastrosBiblioteca.adicionarUsuario(new Professor(cadastrosIDs.IDNovo(escolhaClassificacao.substring(0, 1)), nome));
                                        classificacaoEscolhida = true;
                                        break;
                                    case "0":
                                        break label;
                                    default:
                                        System.out.println("Escolha uma opção válida");
                                        break;
                                }
                            }
                            break;
                        } catch (Exception e) {
                            System.out.println();
                            System.err.println("Ocorreu um erro ao cadastrar o usuário");
                        }
                    }
                        System.out.println("Usuário cadastrado com sucesso");
                        break;
                    case 2:
                        cadastrosBiblioteca.listarUsuarios();
                        break;
                    case 3:
                    while (true){
                        try {
                            System.out.print("ID do usuário a ser removido: ");
                            String idRemocao = scanner.next().toUpperCase();
                            ID idEncontrado = cadastrosIDs.encontrarID(idRemocao);
                            cadastrosBiblioteca.removerUsuario(idEncontrado);
                            cadastrosIDs.removerID(idEncontrado);
                            break;
                        } catch (LivroNaoEncontradoExeption | UsuarioNaoEncontradoExeption |
                                 LivroIndisponivelException |
                                 LimiteDeLivrosExcedidoExeption | IDNaoEncontradoExeption e)
                        {
                            System.err.println(e.getMessage());
                            System.out.println();
                        } catch (Exception e) {
                            System.out.println();
                            System.err.println("Erro ao remover ID");
                        }
                    }
                        System.out.println("Usuário removido com sucesso...");
                        break;

                    case 4:
                    while (true){
                        try {
                            scanner.nextLine();
                            System.out.print("Nome do livro: ");
                            String nomeLivro = scanner.nextLine();
                            System.out.print("Autor do livro: ");
                            String nomeAutor = scanner.nextLine();
                            cadastrosBiblioteca.cadastrarLivro(new Livro(cadastrosIDs.IDNovo(), nomeLivro, nomeAutor));
                            break;
                        } catch (Exception e) {
                            System.out.println();
                            System.err.println("Erro ao cadastrar livro");
                        }
                    }
                        System.out.println("Livro cadastrado com sucesso");
                        break;
                    case 5:
                    while (true){
                        try {
                            System.out.print("ID do Usuário: ");
                            idUsuario = scanner.next().toUpperCase();
                            System.out.print("ID do livro: ");
                            idLivro = scanner.next().toUpperCase();

                            ID livroID = cadastrosIDs.encontrarID(idLivro);
                            ID usuarioID = cadastrosIDs.encontrarID(idUsuario);

                            bibliotecaService.emprestarLivro(usuarioID,livroID);
                            break;
                        } catch (LivroNaoEncontradoExeption | UsuarioNaoEncontradoExeption |
                                 LivroIndisponivelException |
                                 LimiteDeLivrosExcedidoExeption | IDNaoEncontradoExeption e) {
                            System.out.println();
                            System.err.println(e.getMessage());
                        }
                    }
                        System.out.println("Livro emprestado com sucesso");
                        break;
                    case 6:
                    while (true){
                        try {
                            System.out.print("ID do livro: ");
                            idLivro = scanner.next().toUpperCase();
                            System.out.print("ID do Usuário: ");
                            idUsuario = scanner.next().toUpperCase();
                            bibliotecaService.devolverLivro(idUsuario, idLivro);
                            break;
                        } catch (LivroNaoEncontradoExeption | UsuarioNaoEncontradoExeption |
                                 LivroIndisponivelException |
                                 LimiteDeLivrosExcedidoExeption | IDNaoEncontradoExeption e) {
                            System.out.println();
                            System.err.println(e.getMessage());
                        }
                    }
                        System.out.println("Livro devolvido com sucesso");
                        break;
                    case 7:
                        cadastrosBiblioteca.listarLivros();
                        break;
                    case 8:
                    while (true){
                        try {
                            System.out.print("ID do livro: ");
                            idLivro = scanner.next();
                            ID idEncontrado = cadastrosIDs.encontrarID(idLivro);
                            cadastrosBiblioteca.removerLivro(idEncontrado);
                            break;
                        } catch (LivroNaoEncontradoExeption | IDNaoEncontradoExeption e) {
                            System.out.println();
                            System.err.println(e.getMessage());
                        }
                    }
                        break;
                    default:
                        System.out.println("A escolha não existe");
                }
                if (escolhaMenu == 0) break;
            }catch (Exception e){
                scanner.nextLine();
                System.out.println();
                System.err.println("Tipo inválido");
            }
        }
        scanner.close();
    }

}
