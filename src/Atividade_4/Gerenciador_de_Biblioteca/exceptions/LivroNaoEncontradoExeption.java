package Atividade_4.Gerenciador_de_Biblioteca.exceptions;

public class LivroNaoEncontradoExeption extends RuntimeException {
    public LivroNaoEncontradoExeption(String message) {
        super(message);
    }
}
