package Atividade_3.Q_09;

import java.util.Scanner;

class SaldoInsuficienteExeption extends Exception{
    public SaldoInsuficienteExeption(String mensagem){
        super(mensagem);
    }
}

class ContaBancaria{
    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }
    public void sacar(double saque) throws SaldoInsuficienteExeption{
        if(saque > this.saldo){
            throw new SaldoInsuficienteExeption("Erro ao solicitar saque: Saldo insuficiente");
        } else if (saque == this.saldo) {
            this.saldo-=saque;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(2500);
        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.print("Valor de saque: ");
            double saque = scanner.nextDouble();
            conta.sacar(saque);
        } catch (SaldoInsuficienteExeption e) {
            System.err.println(e.getMessage());
        }
    }
}