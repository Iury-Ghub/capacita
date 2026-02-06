package mini_projeto.exceptions;

public class UsuarioNaoEncontradoExeption extends RuntimeException {
    public UsuarioNaoEncontradoExeption(String message) {
        super(message);
    }
}
