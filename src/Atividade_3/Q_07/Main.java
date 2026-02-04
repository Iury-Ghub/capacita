package Atividade_3.Q_07;

import java.util.InputMismatchException;
import java.util.Scanner;

class Leitor{

    public Leitor() {

    }

    public int lerNumeroInteiro(){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida){
            try {
                System.out.print("Digíte um número inteiro: ");
                numero = scanner.nextInt();
                entradaValida = true;
            }catch (InputMismatchException e){
                System.out.println("entrada inválida. Por favor, digídte um número válido");
                scanner.nextLine();
            }
        }
        scanner.close();
        return numero;
    }
}

public class Main {
    public static void main(String[] args) {
        Leitor leitor = new Leitor();
        int numero = leitor.lerNumeroInteiro();
        System.out.println(numero);
    }
}
