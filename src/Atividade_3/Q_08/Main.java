package Atividade_3.Q_08;

import java.util.Scanner;

class IdadeInvalidaException extends Exception{
    public IdadeInvalidaException(String mensagem){
        super(mensagem);
    }
}

class SistemaIdade{
    public static void validarIdade(int idade) throws IdadeInvalidaException{
        if(idade<18){
            throw new IdadeInvalidaException("Acesso negado: Idade inferior a 18.");
        }
        System.out.println("Acesso permitido. Bem-vindo!");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        try {
            SistemaIdade.validarIdade(idade);
        }catch (IdadeInvalidaException e){
            System.err.println(e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
