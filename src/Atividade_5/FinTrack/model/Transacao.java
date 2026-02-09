package Atividade_5.FinTrack.model;

import java.time.LocalDate;

public class Transacao {
    private ID ID;
    private String descricao;
    private double valor;
    private boolean isReceita;
    private LocalDate localDate;

    public Transacao(String descricao, double valor, boolean isReceita, ID id) {
        this.ID=id;
        this.descricao = descricao;
        this.valor = valor;
        this.isReceita = isReceita;
        this.localDate = LocalDate.now();
    }

    public ID getID() {return ID;}

    public void setID(ID ID) {this.ID = ID;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getDiaTransacao(){
        return 0;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isReceita() {
        return isReceita;
    }

    public void setReceita(boolean receita) {
        isReceita = receita;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

}
