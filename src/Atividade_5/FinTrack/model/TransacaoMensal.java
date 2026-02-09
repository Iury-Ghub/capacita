package Atividade_5.FinTrack.model;

import java.time.LocalDate;

public class TransacaoMensal extends Transacao {
    private LocalDate dataUltima;
    private int diaTransacao;

    public TransacaoMensal(String descricao, double valor, boolean isReceita, int diaTransacao, ID id) {
        super(descricao, valor,isReceita,id);
        this.dataUltima = LocalDate.now();
        this.diaTransacao = diaTransacao;
    }

    public LocalDate getDataUltima() {
        return dataUltima;
    }

    public void setDataUltima(LocalDate dataUltima) {
        this.dataUltima = dataUltima;
    }

    @Override
    public int getDiaTransacao() {
        return diaTransacao;
    }

    public void setDiaTransacao(int diaTransacao) {
        this.diaTransacao = diaTransacao;
    }

}
