package Atividade_3.Q_05;

interface Autenticavel{
    boolean autenticar(String senha);
}

class Usuario implements Autenticavel{
    private String senha;

    public Usuario(String senha){
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        if(senha.equals(this.senha)) {
            System.out.println("Senha correta");
            return true;
        }else {
            System.out.println("Senha incorreta");
            return false;
        }
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

class Administrador implements  Autenticavel{
    private String senhaMestra="Senha_mestra";

    public Administrador() {}

    public String getSenhaMestra() {
        return senhaMestra;
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.equals(senhaMestra) && senha.length() < 8;
    }
}


public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("123");
        Administrador administrador = new Administrador();
        administrador.autenticar("sss");
        administrador.autenticar("Senha_mestra");
        usuario.autenticar("123");
    }
}
