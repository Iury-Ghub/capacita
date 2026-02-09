package Atividade_5.FinTrack.controller;

import Atividade_5.FinTrack.model.ID;
import Atividade_5.FinTrack.model.Transacao;
import Atividade_5.FinTrack.model.TransacaoMensal;

import java.time.LocalDate;
import java.util.ArrayList;

public class FinTracker {
    private final ArrayList<Transacao> transacoes;
    private final ArrayList<Transacao> transacoesMensais;
    double saldo;

    public FinTracker() {
        this.transacoes = new ArrayList<>();
        this.transacoesMensais = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao){
        if(transacao.getID().getTipo().equals("T")){
            transacoes.add(transacao);
        }else{
            transacoesMensais.add(transacao);
        }
    }

    public void listarTransacoes(){
        System.out.print("| Lista de transações:\n");
        if(!transacoes.isEmpty()) {
            System.out.println("Transações Normais:");
            for (Transacao transacao : transacoes) {
                System.out.printf("| ID: %s" + "\n| Descrição: %s" + "\n| Valor: R$ %.2f \n| Data: %s\n", transacao.getID(), transacao.getDescricao(), transacao.getValor(), transacao.getLocalDate());
                if (transacao.isReceita()) {
                    System.out.println("| Receita");
                } else {
                    System.out.println("| Despesa");
                }
            }
        } if (!transacoesMensais.isEmpty()) {
            System.out.println("Transações Mensais: ");
            for (Transacao transacao : transacoesMensais){
                System.out.printf("| ID: %s" + "\n| Descrição: %s" + "\n| Valor: R$ %.2f \n| Data: %s\n | ", transacao.getID(), transacao.getDescricao(), transacao.getValor(), transacao.getLocalDate(),transacao.getDiaTransacao());
                if (transacao.isReceita()) {
                    System.out.println("| Receita");
                } else {
                    System.out.println("| Despesa");
                }
            }
        } else {
            System.out.print("\u001B[31m| A lista está vazia...\u001B[0m\n");
        }
    }

    public void removerTransacao(String tipo, int numero){
        if(tipo.equals("T")){
            transacoes.removeIf(transacao -> transacao.getID().getNumero() == numero);
        }else{
            transacoesMensais.removeIf(transacao -> transacao.getID().getNumero() == numero);
        }
    }

    public void verificarTransacaoMensal(){
        for (Transacao transacao:transacoes){
            if(transacao instanceof TransacaoMensal mensal){
                int diaProgramado = mensal.getDiaTransacao();
                int diaAtual = LocalDate.now().getDayOfMonth();
                if (diaProgramado == diaAtual){
                    if(mensal.isReceita()){
                        saldo += mensal.getValor();
                        System.out.println("O valor mensal foi adicionade na sua conta");
                    }else{
                        saldo -= mensal.getValor();
                        System.out.println("O valor mensal foi retirado da sua conta");
                    }
                }
            }
        }
    }

    public double calcularSaldoTotal(){
        for (Transacao transacao:transacoes){
            if(transacao.isReceita()){
                saldo += transacao.getValor();
            }else {
                saldo -= transacao.getValor();
            }
        }
        return  saldo;
    }
}
