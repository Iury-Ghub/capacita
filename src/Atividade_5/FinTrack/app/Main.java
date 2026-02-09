package Atividade_5.FinTrack.app;

import Atividade_5.FinTrack.controller.FinTracker;
import Atividade_5.FinTrack.exeptions.EntradaInvalidaExeption;
import Atividade_5.FinTrack.model.ID;
import Atividade_5.FinTrack.model.Transacao;
import Atividade_5.FinTrack.model.TransacaoMensal;

import java.time.LocalDate;
import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws EntradaInvalidaExeption{
        String escolha, descricao;
        int valor;
        boolean inicializacao = false, fluxo;
        Scanner scanner = new Scanner(System.in);
        FinTracker finTracker = new FinTracker();


        while (true){
            try {
                if(inicializacao) Thread.sleep(1500);
                System.out.printf(
                        """
                        +=======================+
                        |     \u001B[32mSaldo: R$ %.2f\u001B[0m    |
                        +=======================+
                        | 1-Adicionar transação |
                        | 2-Listar Transações   |
                        | 3-Remover Transação   |
                        | 4-Add transação mensal|
                        | 0-Sair                |
                        +=======================+""",finTracker.calcularSaldoTotal());
                System.out.print("\n* Escolha: ");
                escolha = scanner.next();
                System.out.println(
                        "+=======================+"
                );

                if(escolha.equals("0")){scanner.close();break;}

                switch (escolha) {
                    case "1":
                        scanner.nextLine();
                        System.out.print(
                                "* Descrição: "
                        );
                        descricao = scanner.nextLine();
                        System.out.print(
                                "* Valor: R$ "
                        );
                        valor = scanner.nextInt();

                        while (true) {
                            System.out.print(
                                    """
                                    R-Receita
                                    D-Despesa
                                    * Escolha:\s""");
                            escolha = scanner.next().toUpperCase().substring(0, 1);

                            if (escolha.equals("R")) {
                                fluxo = true;
                                break;
                            } else if (escolha.equals("D")) {
                                fluxo = false;
                                break;
                            } else {
                                throw new Exception();
                            }
                        }
                        finTracker.adicionarTransacao(new Transacao(descricao, valor, fluxo,new ID("T")));
                        break;
                    case "2":
                        finTracker.listarTransacoes();
                        break;
                    case "3":
                        System.out.print(
                                """
                                Tipo da transação:
                                T-Transacao
                                M-Transacao Mensal
                                """
                        );
                        String tipo = scanner.next().toUpperCase().substring(0,1);
                        System.out.print(
                                """
                                Numero da transação:
                                """
                        );
                        int id_numero = scanner.nextInt();
                        finTracker.removerTransacao(tipo,id_numero);
                        break;
                    case "4":
                        scanner.nextLine();
                        System.out.print(
                                "* Descrição da transação mensal: "
                        );
                        descricao = scanner.nextLine();
                        System.out.print(
                                "* Valor: R$ "
                        );
                        valor = scanner.nextInt();

                        while (true) {
                            System.out.print(
                                    """
                                    R-Receita
                                    D-Despesa
                                    * Escolha:\s""");
                            escolha = scanner.next().toUpperCase().substring(0, 1);
                            if (escolha.equals("R")) {
                                fluxo = true;
                                break;
                            } else if (escolha.equals("D")) {
                                fluxo = false;
                                break;
                            } else {
                                throw new Exception();
                            }
                        }
                        finTracker.adicionarTransacao(new TransacaoMensal(descricao, valor, fluxo, LocalDate.now().getDayOfMonth(),new ID("M")));
                    default:
                        throw new EntradaInvalidaExeption("ERRO: Escolha uma opção válida");
                }

            }catch (EntradaInvalidaExeption e){
                scanner.nextLine();
                System.out.println();
                System.err.println(e.getMessage());
            }catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }catch (Exception ignored){
                scanner.nextLine();
                System.out.println();
                System.err.println("ERRO: Ocorreu um erro inesperado");
            }

        }

    }
}
