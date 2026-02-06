package mini_projeto.exceptions;

public class LivroIndisponivelException extends RuntimeException {
    public LivroIndisponivelException(String message) {
        super(message);
    }
}
