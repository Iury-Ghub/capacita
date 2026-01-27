package Atividade_1;

import java.util.Scanner;

public class atividade_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolha;
        while (true) {

            for (int i = 1; i <= 10; i++) {
                System.out.println(i + "-Questão " + i);
                if (i == 10) {
                    System.out.println("0-Sair");
                }
            }

            System.out.print("Escolha: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                int numero_Q1 = 15;
                System.out.println(numero_Q1 > 10 && numero_Q1 <= 20);
            } else if (escolha == 2) {
                char dado1_Q2 = 'A';
                short dado2_Q2 = 5;
                byte dado3_Q2 = 127;
                long dado4_Q2 = 5;
                int dado5_Q2 = 5;
                double dado6_Q2 = 5.5;
                float dado7_Q2 = 5.5f;

                System.out.println(
                        "\nChar: " + dado1_Q2 +
                                "\nShort: " + dado2_Q2 +
                                "\nByte: " + dado3_Q2 +
                                "\nlong: " + dado4_Q2 +
                                "\nInt: " + dado5_Q2 +
                                "\nDouble: " + dado6_Q2 +
                                "\nFloat: \n" + dado7_Q2
                );
            } else if (escolha == 3) {

                while (true) {
                    System.out.println(
                            "1 - Somar dois números\n" +
                                    "2 - Subtrair dois números\n" +
                                    "3 - Sair\n" +
                                    "Escreva sua escolha: "
                    );

                    int escolha_Q3 = scanner.nextInt();

                    int numero1_Q3, numero2_Q3;

                    switch (escolha_Q3) {
                        case 1:
                            System.out.println("Digite o primeiro numero: ");
                            numero1_Q3 = scanner.nextInt();
                            System.out.println("Digite o segundo numero: ");
                            numero2_Q3 = scanner.nextInt();
                            System.out.println("A resposta é: " + (numero1_Q3 + numero2_Q3));
                            break;
                        case 2:
                            System.out.println("Digite o primeiro numero: ");
                            numero1_Q3 = scanner.nextInt();
                            System.out.println("Digite o segundo numero: ");
                            numero2_Q3 = scanner.nextInt();
                            System.out.println("A resposta é: " + (numero1_Q3 - numero2_Q3));
                            break;

                        case 3:
                            break;

                        default:
                            System.out.println("Digíte uma opção válida...");
                    }

                    if (escolha_Q3 == 3) {
                        break;
                    }

                }
            } else if (escolha == 4) {
                System.out.println("Escreva um número: ");
                int numero_Q4 = scanner.nextInt();

                for (int i = 1; i <= 10; i++) {
                    System.out.println(numero_Q4 + " x " + i + "=" + (numero_Q4 * i));
                }
            } else if (escolha == 5) {
                System.out.println("Escreva uma palavra: ");
                String palavra_Q5 = scanner.nextLine();
                System.out.println("Resultado: " + palavra_Q5.replace('a', '*'));
            } else if (escolha == 6) {
                String[] nomes_Q6 = {"Maria", "João", "Carlos", "Ana", "Beatriz"};
                System.out.println("Escreva um nome");
                String nome_Q6 = scanner.next();
                for (String nome : nomes_Q6) {
                    if (nome.equals(nome_Q6)) {
                        System.out.println("O nome existe...");
                    }
                }
            } else if (escolha == 7) {
                System.out.println("Escreva um número:");
                int numero_Q7 = scanner.nextInt();
                int fatorial = 1;
                for (int i = numero_Q7; i >= 1; i--) {
                    fatorial *= i;
                }
                System.out.println(fatorial);
            } else if (escolha == 8) {
                while (true) {
                    System.out.println(
                            "1 - Dizer \"Olá\"\n" +
                                    "2 - Dizer \"Tchau\"\n" +
                                    "3 - Encerrar\n" +
                                    "Escolha: "
                    );
                    int escolha_Q8 = scanner.nextInt();

                    switch (escolha_Q8) {
                        case 1:
                            System.out.println("Olá");
                        case 2:
                            System.out.println("Tchau");
                    }

                    if (escolha_Q8 == 3) {
                        break;
                    }
                }
            } else if (escolha == 9) {
                System.out.println("Escreva seu nome: ");
                String nome_Q9 = scanner.next();
                String[] partes_Q9 = nome_Q9.split(" ");

                System.out.println("Primeiro nome: " + partes_Q9[0]);
                System.out.println("Ultimo nome: " + partes_Q9[partes_Q9.length - 1]);
            } else if (escolha == 10) {
                System.out.println("Escreva uma frase: ");
                String frase_Q10 = scanner.next();

                String[] palavras_Q10 = frase_Q10.split(" ");

                System.out.println("O número de palavras é: " + palavras_Q10.length);
            }
            if (escolha == 0) {
                break;

            }

            try{
                Thread.sleep(3000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println();
        }

        scanner.close();
    }
}
