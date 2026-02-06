package mini_projeto.exceptions;

public class LivroNaoEncontradoExeption extends RuntimeException {
    public LivroNaoEncontradoExeption(String message) {
        super(message);
    }
}
