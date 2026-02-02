package Atividade_2.Q_10;

import java.util.ArrayList;

class Pagamento{
    public void procesarPagamento(double valor){
        System.out.println("Processando pagamento genérico de R$ "+valor);
    }
}

class PagamentoCartao extends Pagamento{
    @Override
    public void procesarPagamento(double valor) {
        System.out.println("Processando pagamento com cartão de crédito: R$ "+valor);
    }
}

class PagamentoPix extends Pagamento{
    @Override
    public void procesarPagamento(double valor) {
        System.out.println("Processando pagamento via PIX: R$ "+valor);
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(new PagamentoCartao());
        pagamentos.add(new PagamentoPix());

        for(Pagamento pagamento:pagamentos){
            pagamento.procesarPagamento(100);
        }
    }
}
