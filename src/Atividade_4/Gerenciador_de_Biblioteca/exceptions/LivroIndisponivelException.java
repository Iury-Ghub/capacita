package Atividade_4.Gerenciador_de_Biblioteca.exceptions;

public class LivroIndisponivelException extends RuntimeException {
    public LivroIndisponivelException(String message) {
        super(message);
    }
}
