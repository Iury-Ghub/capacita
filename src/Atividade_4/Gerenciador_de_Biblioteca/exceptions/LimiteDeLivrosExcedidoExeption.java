package Atividade_4.Gerenciador_de_Biblioteca.exceptions;

public class LimiteDeLivrosExcedidoExeption extends RuntimeException {
    public LimiteDeLivrosExcedidoExeption(String message) {
        super(message);
    }
}
